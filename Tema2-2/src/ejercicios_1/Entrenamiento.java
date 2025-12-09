package ejercicios_1;

import java.util.Scanner;

public class Entrenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solicita el usuario un número e indique si el número es par o inpar
		int num;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Sime el número que quieres comprobar");
		num = teclado.nextInt();
		teclado.close();
		
		if (num % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es inpar");
		}
	}

}
