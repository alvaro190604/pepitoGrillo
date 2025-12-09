package Tema1_Tema2;

import java.util.Scanner;

public class EjercicioPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime el número");
		num = teclado.nextInt();

		System.out.println("El número es primo?: " + decirSiEsPrimo(num));
	}

	public static boolean decirSiEsPrimo(int num) {
		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		} else
			return false;
	}
}
