package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

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
		
		float num12 = num1;
		float num22 = num2;
		float num32 = num3;
		
		System.out.println(num12 + ", " + num22 + ", " + num32);
	}

}
