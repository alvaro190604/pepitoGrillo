package Tema1_Tema2;

public class Deposito {
	
	String identificador;
	int capacidadMax;
	int cantidadActual;
	boolean operativo;
	
	public Deposito() {
		this.identificador = "id";
		this.capacidadMax = 0;
		this.cantidadActual = 0;
		this.operativo = false;
	}

	public Deposito(String identificador, int capacidadMax, int cantidadActual, boolean operativo) {
		this.identificador = identificador;
		this.capacidadMax = capacidadMax;
		this.cantidadActual = cantidadActual;
		this.operativo = operativo;
	}
	
	
	private void modificarCantidad (int litros) {
		
		if (operativo = true && litros > 0 && (cantidadActual + litros) <= capacidadMax) {
			cantidadActual = cantidadActual + litros;
		} else if (operativo = true && litros < 0 && (cantidadActual - litros) >= 0) {
			cantidadActual = cantidadActual - litros;
		}	
	}
	
	private void calcularNivelTrasModificacion (int litros) {
		
		modificarCantidad(getCantidadActual());
		
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	private void porcentajeLlenado (int cantidadActual, int capacidadMax) {
		
		int porcentaje = (capacidadMax * 100) / cantidadActual;
		
	}
	
	private void estadoDeposito () {
		toString();
		porcentajeLlenado(cantidadActual, capacidadMax);
		System.out.print("%");
		System.out.println("");
	}

	@Override
	public String toString() {
		return "Deposito [identificador=" + identificador + ", capacidadMax=" + capacidadMax + ", cantidadActual="
				+ cantidadActual + ", operativo=" + operativo + "]";
	}
	
	
	
	
	
}
