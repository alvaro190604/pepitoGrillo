package ejercicios_2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intent = 0;
		int num;
		int max = 100;
		int min = 1;
		num = min + (int)(Math.random() * (max - min + 1));
		
		
		int adivina ;
		
		System.out.println(num);
		
		Scanner teclado = new Scanner (System.in);
		
		do {
			System.out.println("Qué numero crees que es??");
			adivina = teclado.nextInt();
			
			intent++;
			System.out.println("Intento " + intent);
			
			if ((num - adivina) < 10 && (num - adivina) > 0) {
				System.out.println("Caliente");
			}
			
		} while (adivina != num && intent < 10); 
			
		if (adivina != num) {
			System.out.println("Se te han acabdo las oportunindades");
		} else {
		System.out.println("Felicidades, el número es correcto");
		}
	}

}