package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inpar;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número");
		inpar = teclado.nextInt();
		teclado.close();
		
		int division = inpar % 2;
		boolean resultado = division != 0;
		
		System.out.println("El numero es inpar? " + resultado);
	}

}