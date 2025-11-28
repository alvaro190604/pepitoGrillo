package ejercicios_2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		int invert;
		int invertido = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe el número");
		num = teclado.nextInt();
		
		num = Math.abs(num);
		while (num > 0) {
			invert = num % 10;
			num = num / 10;
			
			invertido = invertido * 10 + invert;
			
			System.out.println(invertido);
		}
	}

}
