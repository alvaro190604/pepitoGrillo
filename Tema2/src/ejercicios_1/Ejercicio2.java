package ejercicios_1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el primer número");
		num1 = teclado.nextInt();
		
		System.out.println("Dime el se número");
		num2 = teclado.nextInt();
		teclado.close();
		
		if (num1 < num2) {
			System.out.println(num1 + " , " + num2);
		}
		if (num1 > num2) {
			System.out.println(num2 + " , " + num1);
		}
	}

}
