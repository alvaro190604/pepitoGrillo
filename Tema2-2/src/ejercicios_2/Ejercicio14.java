package ejercicios_2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		int edadMax = 0;
		int edadMin = 100;
		
		Scanner teclado = new Scanner (System.in);
		
		do {
			System.out.println("Dime la edad del alumno");
			edad = teclado.nextInt();
			
			if (edad < 0 || edad >= 100) {
				System.out.println("Número incorrecto, intentalo");
			}
			else if (edad >= 1 && edad <= 99) {
				System.out.println("La edad del alumno es: " + edad);
				if (edad > edadMax) {
					edadMax = edad;
				}
				if (edad < edadMin) {
					edadMin = edad;
				}
			}
			
		} while (edad != 0);
		System.out.println("La edad más alta es: " + edadMax + "\n" + "La edad más baja es: " + edadMin);
	}

}
