package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int par;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número");
		par = teclado.nextInt();
		teclado.close();
		
		int division = par % 2;
		boolean resultado = division == 0;
		
		System.out.println("El numero es par? " + resultado);
	}

}
