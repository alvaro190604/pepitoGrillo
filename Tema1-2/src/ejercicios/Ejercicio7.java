package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner pedir = new Scanner (System.in);
		
		System.out.println("Dime un número decimal");
		numero = pedir.nextInt();
		pedir.close();
		double numeroCalculado = Math.sqrt(numero);
		System.out.println("El número es " + numeroCalculado);
	}

}
