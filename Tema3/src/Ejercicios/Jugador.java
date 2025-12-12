package Ejercicios;

public class Jugador {

	private int vida;
	private String nombre;

	public Jugador(String nombre) {
		this.vida = 100;
		this.nombre = nombre;
	}

	public void reducirVida() {
		vida = vida - 10;
	}

	public void comprobarDistanciaAleatorio() {
		// ESTE NO HAY QUE HACERLO
	}

	public void imprimirVidaRestante() {
		System.out.println(nombre + " : " + vida + " puntos de vida");
	}

	public boolean haPerdidio() {
		if (vida <= 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Jugador [vida=" + vida + ", nombre=" + nombre + "]";
	}

}
