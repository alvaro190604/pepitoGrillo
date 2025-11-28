package ejercicios;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime un número");
		numero = teclado.nextDouble();
		teclado.close();
		
		double division = numero % 6;
		double resto = 6 - division;
		
		System.out.println(division == 0 ? "Es múltiplo de 6" : "Para que sea múltiplo hay que sumarle " + resto);
	}

}
