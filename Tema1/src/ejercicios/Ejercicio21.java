package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2, num3;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce otro");
		num2 = teclado.nextInt();
		
		System.out.println("Introduce otro");
		num3 = teclado.nextInt();
		teclado.close();
		
		int num12 = (int) num1;
		int num22 = (int) num2;
		int num32 = (int) num3;
		
		System.out.println(num12 + ", " + num22 + ", " + num32);
	}

}