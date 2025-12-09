package ejercicios_2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int numeroSuma = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		while (numeroSuma <= 100) {
			System.out.println("Dime números enteros hasta llegar a 100");
			numero = teclado.nextInt();
			
			if (numero > 0) { 
			numeroSuma = numeroSuma + numero;
			System.out.println("Tu número es: " + numeroSuma);
			
			} else {
				System.out.println("Has introducido un número inválido");
			}
		}
		System.out.println("Acabas de llegar a 100, exactamente a " + numeroSuma);
		teclado.close();
	}

}
