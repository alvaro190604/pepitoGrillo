package ejercicios_2;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num;

		do {
			System.out.println("Introduzca un número mayor que 0: ");
			num = teclado.nextInt();
		} while (num < 0);
		
		String binario = "";
		
		while(num != 0) {
			int cifra = num % 2;
			binario = cifra + binario;
			System.out.println(binario);
			num = num / 2;
		}
		
		System.out.println("El numero binario es: " + binario);

	}

}
