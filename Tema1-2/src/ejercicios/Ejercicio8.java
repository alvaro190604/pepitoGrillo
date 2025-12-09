package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime un número que quieras multiplicar");
		numero = teclado.nextDouble();
		teclado.close();
		
		double resultado = numero * 3;
		
		System.out.println("El resultado sería " + resultado);
	}

}
