package Tema1_Tema2;

import java.util.Scanner;

public class Ej22RepasoBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int divisible = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime el número");
		num = teclado.nextInt();

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				divisible = divisible + i;
			}
		}
		if (divisible == num) {
			System.out.println("El numero es perfecto");
		} else {
			System.out.println("El numero no es perfecto");
		}

	}

}
