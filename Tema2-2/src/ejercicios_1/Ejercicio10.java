package ejercicios_1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime un número");
		num1 = teclado.nextInt();
		
		System.out.println("Dime otro");
		num2 = teclado.nextInt();
		
		System.out.println("Dime otro");
		num3 = teclado.nextInt();
		teclado.close();
		
		if (num1 >= num2 && num2 >= num3) {
			System.out.println(num1 + "," + num2 + "," + num3);
		}
		else if (num1 <= num2 && num2 <= num3) {
			System.out.println(num3 + "," + num2 + "," + num1);
		}
		else if (num2 >= num3 && num3 >= num1) {
			System.out.println(num2 + "," + num3 + "," + num1);
		}
		else if (num3 >= num1 && num1 >= num2) {
			System.out.println(num3 + "," + num1 + "," + num2);
		}
		else if (num1 >= num3 && num3 >= num2) {
			System.out.println(num1 + "," + num3 + "," + num2);
		}
		else if (num2 >= num1 && num1 >= num3) {
			System.out.println(num2 + "," + num1 + "," + num3);
		}
	}

}
