package ejercicios_2;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int num;
		int sumatorio = 0;

		System.out.println("Introduzca el número");
		num = teclado.nextInt();

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sumatorio = sumatorio + i;
			}
			System.out.println("i: " + i + " , sumatorio: " + sumatorio);
		}

		if (sumatorio == num) {
			System.out.println("El numero es perfecto");
		} else {
			System.out.println("El numero no es perfecto");
		}
	}

}
