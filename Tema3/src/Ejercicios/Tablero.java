package Ejercicios;

public class Tablero {
	private Punto p ;

	public Tablero() {
		this.p = new Punto();
	}


	public void imprimirTablero() {
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("\t" + i);
		}
		System.out.println();

		for(int i = 10; i >= 1; i--) {
			System.out.print(i + "\t");
			for(int j = 1; j <= 10; j++) {
				
				/*Comprobar si el punto está en esta posición y pintarlo.
				 * */
				if(this.p.getY() == i && this.p.getX() == j) {
					System.out.print("o");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
	
	public void desplazarEnX(int desplazamiento) {
		int nuevaPosX = this.p.getX() + desplazamiento;
		if (nuevaPosX <= 0) {
			nuevaPosX = 1;
		} else if (nuevaPosX >= 11) {
			nuevaPosX = 10;
		}
		this.p.setX(nuevaPosX);
	}

	public void desplazarEnY(int desplazamiento) {
		int nuevaPosY = this.p.getY() + desplazamiento;
		if (nuevaPosY <= 0) {
			nuevaPosY = 1;
		} else if (nuevaPosY >= 11) {
			nuevaPosY = 10;
		}
		this.p.setY(nuevaPosY);
	}

	public Punto getP() {
		return this.p;
	}

	public void setP(Punto p) {
		this.p = p;
	}
	
	public double imprimirDistanciaEuclidea (int x, int y) {
		double operacion1 = this.p.getX() - x;
		double operacion2 = this.p.getY() - y;
		return Math.sqrt((operacion1 * operacion1) + (operacion2 * operacion2));
	}
	/*
	 * public double imprimirDistanciaEuclidea (Punto p) {
		double operacion1 = this.p.getX() - p.x;
		double operacion2 = this.p.getY() - p.y;
		return Math.sqrt((operacion1 * operacion1) + (operacion2 * operacion2));
	}
	 * 
	 * */
	
	
}
