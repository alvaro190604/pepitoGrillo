package ejercicios_2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int max = 100;
		int min = 1;
		num = min + (int)(Math.random() * (max - min + 1));
		
		int adivina = num;
		
		System.out.println(num);
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Qué numero crees que es??");
		num = teclado.nextInt();
				
		do {
			System.out.println("Intentalo de nuevo");
			num = teclado.nextInt();
		} while (adivina != num); 
		
		System.out.println("Felicidades, el número es correcto");
	}

}
