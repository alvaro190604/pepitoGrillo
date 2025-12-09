package ejercicios_1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime un número del 1 al 10");
		num = teclado.nextInt();
		teclado.close();
		
		if (num >= 1 && num <= 10) {
			System.out.println("El número es:");
		} else {
			System.out.println("ERROR");
		}
		if (num == 1) {
			System.out.println("Uno");
		}
		if (num == 2) {
			System.out.println("Dos");
		}
		if (num == 3) {
			System.out.println("Tres");
		}
		if (num == 4) {
			System.out.println("Cuatro");
		}
		if (num == 5) {
			System.out.println("Cinco");
		}
		if (num == 6) {
			System.out.println("Seis");
		}
		if (num == 7) {
			System.out.println("Siete");
		}
		if (num == 8) {
			System.out.println("Ocho");
		}
		if (num == 9) {
			System.out.println("Nueve");
		}
		if (num == 10) {
			System.out.println("Diez");
		}
	}

}
