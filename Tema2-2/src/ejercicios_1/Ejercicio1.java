package ejercicios_1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime un número");
		num = teclado.nextInt();
		teclado.close();
		
		if (num % 2 == 0) {
			System.out.println("El número es par");
		}
			
		if (num % 2 != 0) {
			System.out.println("El número es inpar");
		}
	}

}
