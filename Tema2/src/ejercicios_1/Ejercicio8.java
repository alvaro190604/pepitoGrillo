package ejercicios_1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angulo1, angulo2, angulo3;
		int lado1, lado2, lado3;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe el primer ángulo");
		angulo1 = teclado.nextInt();
		
		System.out.println("Escribe el segundo ángulo");
		angulo2 = teclado.nextInt();
		
		System.out.println("Escribe el tercer ángulo");
		angulo3 = teclado.nextInt();
		
		System.out.println("Escribe el primer lado");
		lado1 = teclado.nextInt();
		
		System.out.println("Escribe el segundo lado");
		lado2 = teclado.nextInt();
		
		System.out.println("Escribe el tercer lado");
		lado3 = teclado.nextInt();
		teclado.close();
		
		int sumaAngulos = angulo1 + angulo2 + angulo3;
		
		if (sumaAngulos != 180) {
			System.out.println("No es un triángulo");
		} else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			System.out.println("Es un triángulo rectángulo");	
		} else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			System.out.println("Es un triángulo obtusángulo");
		} else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
			System.out.println("Es un triángulo agudo");
		}else {System.out.println("Error");		}
		
		if (sumaAngulos != 180) {
			System.out.println("No es un triángulo");
		}else if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Es un triángulo equilátero");
		}else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			System.out.println("Es un triángulo escaleno");
		}else if (lado1 != lado2 || lado2 != lado3) {
			System.out.println("Es un triángulo isósceles");
		}else {System.out.println("Error");		}
	}

}
