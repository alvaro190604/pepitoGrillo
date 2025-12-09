package ejercicios;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime un número");
		num1 = teclado.nextInt();
		
		System.out.println("Dime otro");
		num2 = teclado.nextInt();
		teclado.close();
		
		
		int division = num1 % num2;
		int resto = num2 - division;
		
		System.out.println(division == 0 ? "Son múltiplos" : "Para que " + num2 + " sea múltiplo de " + num1 + " hay que sumarle " + resto);
	}

}
