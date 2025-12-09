package ejercicios_2;

import java.util.Scanner;

public class Ejercicio10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		boolean esPrimo = true;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Dime un número para ver si es primo o no");
			numero = teclado.nextInt();
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo == true) {
				System.out.println(numero + "  es primo");
			} else {
				System.out.println(numero + " no es primo");
				esPrimo = true;
			}			


		} while (esPrimo == false);

	}
}
