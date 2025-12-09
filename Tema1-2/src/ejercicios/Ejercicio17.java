package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float num1,num2,num3;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime un número");
		num1 = teclado.nextFloat();
		
		System.out.println("Dime otro");
		num2 = teclado.nextFloat();
		
		System.out.println("Dime otro");
		num3 = teclado.nextFloat();
		teclado.close();
		
		boolean ordenado = (num1 < num2 && num2 < num3) || (num1 > num2 && num2 > num3);
		
		System.out.println("Están ordenados estos números?" + ordenado);
	}

}
