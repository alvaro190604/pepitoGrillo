package ejercicios_1;

import java.util.Scanner;

public class Ejercicio16 {

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
			num = num / 10;
			System.out.println(num1);
		}
		else if (num >= 10 && num <= 99) {
			int num1 = num % 10;
			num = num / 10;
			int num2 = num % 10;
			num = num / 10;
			System.out.println(num1 + "" + num2);
		}
		else if (num >= 100 && num <= 999) {
			System.out.println("");
			int num1 = num % 10;
			num = num / 10;
			int num2 = num % 10;
			num = num / 10;
			int num3 = num % 10;
			num = num / 10;
			System.out.println(num1 + "" + num2 + "" + num3);
		}
		else if (num >= 1000 && num <= 9999) {
			System.out.println("");
			int num1 = num % 10;
			num = num / 10;
			int num2 = num % 10;
			num = num / 10;
			int num3 = num % 10;
			num = num / 10;
			int num4 = num % 10;
			num = num / 10;
			System.out.println(num1 + "" + num2 + "" + num3 + "" + num4);
		}
		else {System.out.println("Mi rango de lectura no es tan alto/bajo");
		}
	}

}
