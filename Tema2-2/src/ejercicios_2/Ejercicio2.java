package ejercicios_2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int multiplicador = 0;
		int resultado = 0;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dime el número que quieres que multiplique");
		numero = teclado.nextInt();
		
		while (multiplicador <= 10) {
			
			resultado = numero * multiplicador;
			System.out.println(numero + " * " + multiplicador + " = " + resultado);
			multiplicador++;
		}
		teclado.close();
	}

}
