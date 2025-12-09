package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuAño;
		double añoActual;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime tu año de nacimiento");
		tuAño = teclado.nextDouble();
		
		System.out.println("Dime el año actual");
		añoActual = teclado.nextDouble();
		teclado.close();
		
		double resultado = añoActual - tuAño;
		
		System.out.println("Tu edad sería: " + resultado);
	}

}
