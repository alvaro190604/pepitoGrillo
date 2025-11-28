package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime un número");
		numero1 = teclado.nextInt();
		teclado.close();
		
		boolean resultado = 3 == numero1;
		
		System.out.println(resultado);
 	}

}
