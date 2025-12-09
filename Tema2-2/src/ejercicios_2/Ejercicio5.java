package ejercicios_2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int resultado = 1;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número");
		num = teclado.nextInt();
		
		
		while (num < 1 || num > 10) {
			System.out.println("El número no es válido, vuelve a probar con un número entre 1 y 10");
			num = teclado.nextInt();
					
		} for (int i = 1; i <= num; i++) {
			resultado = resultado * i;
			System.out.println(resultado);
		}
	}

}
