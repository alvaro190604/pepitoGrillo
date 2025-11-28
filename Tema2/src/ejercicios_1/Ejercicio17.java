package ejercicios_1;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número");
		num = teclado.nextInt();
		teclado.close();
		
		if (num >= 0 && num <= 9) {
			System.out.println("El número es: " + num);
			int num1 = num % 10;
			int num11 = num / 10;
			boolean narcisista = Math.pow(num1, 1) == num;
			System.out.println(narcisista);
		}
		else if (num >= 10 && num <= 99) {
			int num1 = num % 10;
			int num11 = num / 10;
			int num2 = num % 10;
			int num12 = num11 / 10;
			boolean narcisista = Math.pow(num1, 2) + Math.pow(num2, 2) == num;
			System.out.println(narcisista);
		}
		else if (num >= 100 && num <= 999) {
			System.out.println("");
			int num1 = num % 10;
			int num11 = num / 10;
			int num2 = num11 % 10;
			int num12 = num11 / 10;
			int num3 = num12 % 10;
			int num13 = num12 / 10;
			boolean narcisista = Math.pow(num1, 3) + Math.pow(num2, 3) + Math.pow(num3, 3) == num;
			System.out.println(narcisista);
		}
		else if (num >= 1000 && num <= 9999) {
			System.out.println("");
			int num1 = num % 10;
			int num11 = num / 10;
			int num2 = num11 % 10;
			int num12 = num11 / 10;
			int num3 = num12 % 10;
			int num13 = num12 / 10;
			int num4 = num13 % 10;
			int num14 = num13 / 10;
			boolean narcisista = Math.pow(num1, 4) + Math.pow(num2, 4) + Math.pow(num3, 4) + Math.pow(num4, 4)== num;
			System.out.println(narcisista);
		}
		else {System.out.println("Mi rango de lectura no es tan alto/bajo");
		}
	}

}
