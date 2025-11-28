package ejercicios_1;

import java.util.Scanner;

public class Ejercicio6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numMes;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el número del mes");
		numMes = teclado.nextInt();
		teclado.close();
		
		switch (numMes) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("El més tiene 31 días");
			break;
		case 4, 6, 9, 11:
			System.out.println("El més tiene 30 días");
			break;
		case 2:
			System.out.println("El més tiene 28 días");
			break;
		default: System.out.println("Solo hay meses del 1 al 12");
		}
	}
}
