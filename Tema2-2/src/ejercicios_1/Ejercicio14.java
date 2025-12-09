package ejercicios_1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0; 
		double a, b, c;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número que es A");
		a = teclado.nextDouble();
		
		System.out.println("Dime el número que es B");
		b = teclado.nextDouble();
		
		System.out.println("Dime el número que es C");
		c = teclado.nextDouble();
		teclado.close();
		
		double discriminante = Math.pow(b, 2) - (4 * a * c);
		
		if (discriminante > 0) { 
			x = (-b + Math.sqrt(discriminante)) / (2 * a);
			double x1 = (-b - Math.sqrt(discriminante)) / (2 * a);
			System.out.println("La solución puede ser cualquiera de estas 2: " + "\n" +
								x + "\n" +
								x1);
		}
		else if (discriminante < 0) { 
			System.out.println("No existe solución real");
			
		}
		else if (discriminante == 0) { 
			x = (-b / (2 * a));
			System.out.println("La solución es: " + x);
		}
	
	}

}
