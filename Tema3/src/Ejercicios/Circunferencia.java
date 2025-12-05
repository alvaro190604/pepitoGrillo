package Ejercicios;

public class Circunferencia {

	private int radio;
	public static final double PI = 3.1416;
	public Circunferencia (int radio) {
		this.radio = radio;
	}
	
	public int calcularDiametro() {
		return (this.radio * 2);
	}
	
	public double calcularArea() {
		return (PI * this.radio * this.radio);
	}
	
	public double calcularLongitud() {
		return (2 * PI * this.radio);
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circunferencia [radio=" + radio + "]";
	}
	
}
