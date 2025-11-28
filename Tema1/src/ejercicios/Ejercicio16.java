package ejercicios;

import java.util.Scanner;

public class Ejercicio16 {

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
		
		boolean negativo = num1 <0 || num2 <0 || num3 <0;
		
		System.out.println("Hay algún número negativo? " + negativo);
	}

}
