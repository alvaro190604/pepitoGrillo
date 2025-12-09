package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero1;
		double numero2;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el primer número");
		numero1 = teclado.nextDouble();
		
		System.out.println("Dime el segundo número");
		numero2 = teclado.nextDouble();
		teclado.close();
		
		double resultado1 = numero1 + numero2;
		double resultado2 = numero1 - numero2;
		double resultado3 = numero1 * numero2;
		double resultado4 = numero1 / numero2;
		
		System.out.println("La suma es " + resultado1 + "\n" + "La resta es " + resultado2 
				+ "\n" + "La multiplicación es " + resultado3 + "\n" + "La división es " + resultado4);
	}

}
