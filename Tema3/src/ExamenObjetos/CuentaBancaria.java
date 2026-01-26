package ExamenObjetos;

public class CuentaBancaria {
	
	private String titular;
	private int saldo;
	private boolean activa;
	
	public CuentaBancaria() {
		this.titular = "Álvaro";
		this.saldo = 5000;
		this.activa = true;
	}

	public CuentaBancaria(String titular, int saldo, boolean activa) {
		this.titular = titular;
		this.saldo = saldo;
		this.activa = activa;
	}
	
	public void modificarSaldo (int cantidad) {
		int diferencia = saldo + cantidad;
		if (this.activa == true && cantidad > 0) {
			this.saldo = saldo + cantidad;
		} else if (this.activa == true && cantidad < 0 && diferencia >= 0) {
			this.saldo = saldo + cantidad;
		} else {
			this.saldo = saldo;
		}
	}
	
	public int calcularBilletesVeinte () {
		return this.saldo / 20;
	}
	
	private int calcularModificacionSaldo (int cantidad) {
		return this.saldo + cantidad;
	}

	public int verCalcularModificacionSaldo (int cantidad ) {
		return calcularModificacionSaldo(cantidad);
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", saldo=" + saldo + ", activa=" + activa + "]";
	}
	
	
	
}
