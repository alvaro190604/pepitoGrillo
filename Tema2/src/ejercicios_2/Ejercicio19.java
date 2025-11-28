package ejercicios_2;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);

		int numero;
		do {
			System.out.println("Introduzca un número entre 1 y 100");
			numero = teclado.nextInt();
		} while (numero < 1 || numero > 100);

		for (int i = 1; i <= numero; i++) {
			
			
			
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			
			System.out.println();
		}

	}

}
