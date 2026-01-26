package ExamenObjetos;

public class Jugador {
	
	private String nombre;
	private double dineroInicial;
	private double dineroActual;
	
	public Jugador(String nombre, double dineroInicial) {
		this.nombre = nombre;
		this.dineroInicial = dineroInicial;
		this.dineroActual = dineroInicial;
	}

	public double getDineroActual() {
		return dineroActual;
	}

	public void setDineroActual(double dineroActual) {
		this.dineroActual = dineroActual;
	}
	
	public void infoJugador () {
		System.out.print(nombre + " ");
		System.out.print(dineroInicial + " ");
		System.out.print(dineroActual + " ");
		System.out.println("");
	}
	
	public void ganarParImpar (double apuesta) {
		this.dineroActual = this.dineroActual + apuesta * 0.4;
	}
	
	public void ganarNumero (double apuesta) {
		this.dineroActual = this.dineroActual + apuesta * 0.9;
	}
	
	public void perder (double apuesta) {
		this.dineroActual = this.dineroActual - apuesta;
	}
	
	
	
}
