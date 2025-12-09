package Ejercicios;

public class Cuenta {
	
	private String usuario;
	private double dinero;
	private char divisa;
	
	public Cuenta (String usuario, double dinero, char divisa) {
		this.usuario = usuario;
		this.dinero = dinero;
		this.divisa = divisa;
	}
	
	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public char getDivisa() {
		return divisa;
	}

	public void setDivisa(char divisa) {
		this.divisa = divisa;
	}

	public void pasarADolares () {
		
		if(divisa == '€') {
			dinero = (this.dinero * 1.16) - ((this.dinero * 0.5) / 100);
		}else if(divisa == 'L') {
			dinero = (this.dinero * 1.33) - ((this.dinero * 0.5) / 100);
		}else {
			dinero = this.dinero;
		}
	}
	
	public void pasarAEuros () {
		
		if(divisa == '€') {
			dinero = this.dinero;
		}else if(divisa == 'L') {
			dinero = (this.dinero * 1.15) - ((this.dinero * 0.5) / 100);
		}else {
			dinero = (this.dinero * 0.86) - ((this.dinero * 0.5) / 100);
		}
	}
	
	public void pasarALibras () {
		
		if(divisa == '€') {
			dinero = (this.dinero * 0.87) - ((this.dinero * 0.5) / 100);
		}else if(divisa == 'L') {
			dinero = this.dinero;
		}else {
			dinero = (this.dinero * 0.75) - ((this.dinero * 0.5) / 100);
		}
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", dinero=" + dinero + ", divisa=" + divisa + "]";
	}	
	
}
