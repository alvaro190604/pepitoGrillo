package Ejercicios;

public class Punto {

	private int x, y;

	public Punto() {
		this.x = 5;
		this.y = 5;
	}

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "POSICIÓN (" + this.x + "," + this.y + ")";
	}

}
