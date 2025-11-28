package ejercicios;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce otro");
		num2 = teclado.nextInt();
		
		System.out.println("Introduce otro");
		num3 = teclado.nextInt();
		teclado.close();
		
		char num12 = (char) num1;
		char num22 = (char) num2;
		char num32 = (char) num3;
		
		System.out.println(num12 + ", " + num22 + ", " + num32);
	}

}