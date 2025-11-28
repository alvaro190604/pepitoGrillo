package ejercicios_2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int cero = 0;
		int suma = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		do {
			System.out.println("Escribe un número");
			num = teclado.nextInt();
			if (num == 0) {
				cero++;
			}
			suma = suma + num;
			
		} while (cero < 5);
		System.out.println("La suma da igual a: " + suma);
	}

}
