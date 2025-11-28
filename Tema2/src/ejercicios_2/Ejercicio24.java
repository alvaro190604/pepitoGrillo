package ejercicios_2;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		int num = teclado.nextInt();
		
		for (int i = 1 ; i <= num; i++) {
			
			for(int j = 0; j < num - i; j ++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < (i * 2) - 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = num - 1 ; i >= 1; i--) {
			
			for(int j = i; j < num; j ++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= (i * 2) - 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
