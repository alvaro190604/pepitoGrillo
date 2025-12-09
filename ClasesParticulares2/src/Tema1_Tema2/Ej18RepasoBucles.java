package Tema1_Tema2;

import java.util.Scanner;

public class Ej18RepasoBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int opcion;
		int suma = 0;
		int resta = 0;
		int multiplicacion = 0;
		int division = 0;

		Scanner teclado = new Scanner(System.in);

		do {
			do {
				System.out.println("Dime la opción:");
				System.out.println("0 Salir");
				System.out.println("1 Suma");
				System.out.println("2 Resta");
				System.out.println("3 Multiplicación");
				System.out.println("4 División");
				opcion = teclado.nextInt();

				System.out.println("Dime un número");
				num1 = teclado.nextInt();

				System.out.println("Dime otro");
				num2 = teclado.nextInt();

				if (opcion == 1) {
					suma = num1 + num2;
					System.out.println(num1 + " + " + num2 + " = " + suma);
				} else if (opcion == 2) {
					resta = num1 - num2;
					System.out.println(num1 + " - " + num2 + " = " + resta);
				} else if (opcion == 3) {
					multiplicacion = num1 * num2;
					System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
				} else if (opcion == 4) {
					if (num1 == 0 || num2 == 0) {
						System.out.println("En la división no se puede usar ceros");
					} else {
						division = num1 / num2;
						System.out.println(num1 + " / " + num2 + " = " + division);
					}
				} else {
					System.out.println("Opción no válida");
				}
			} while (opcion > 0 && opcion < 5);
		} while (opcion != 0);
		if (opcion == 0) {
			System.out.println("Has salido del programa");
		}
	}
}
