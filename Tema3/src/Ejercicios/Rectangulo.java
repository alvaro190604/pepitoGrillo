package Ejercicios;

public class Rectangulo {

	private int base;
	private int altura;

	public Rectangulo() {
		this.base = 10;
		this.altura = 4;
	}

	public Rectangulo(int base, int altura) {
		if (base > 0) {
			this.base = base;
		} else {
			this.base = 10;
		}
		if (altura > 0) {
			this.altura = altura;
		} else {
			this.altura = 4;
		}
	}

	public int getBase() {
		return this.base;
	}

	public int getAltura() {
		return this.altura;
	}

	public void setBase(int base) {
		if (base > 0) {
			this.base = base;
		}
	}

	public void setAltura(int altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}
	
	public int calcularArea() {
		return (this.base * this.altura);
	}
	
	public int calcularPerimetro() {
		return ((this.altura * 2) + (this.base * 2));
	}
	
	public String decirHoV () {
		if (base > altura) {
			return "Horizontal";
		} else if (base < altura) {
			return "Vertical";
		} else {
			return "La figura no es un rectángulo";
		}
	}
	
	public void imprimirRectangulo () {
		for (int i = 0; i < altura; i++) {
			System.out.println("\n"); 
			for (int j = 0; j < base; j++) {
				System.out.print("*" + "\t");
			}
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
}
