package ejercicios_1;

import java.util.Scanner;

public class Ejercicio6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numMes;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número del mes");
		numMes = teclado.nextInt();
		teclado.close();
		
		if (numMes < 1 || numMes > 12) {
			System.out.println("Solo hay 12 meses");
		}else if (numMes == 1) {
			System.out.println("El mes tiene 31 días");
		}else if (numMes == 2) {
			System.out.println("El mes tiene 28 días");
		}else if (numMes == 3) {
			System.out.println("El mes tiene 31 días");
		}else if (numMes == 4) {
			System.out.println("El mes tiene 30 días");
		}else if (numMes == 5) {
			System.out.println("El mes tiene 31 días");
		}else if (numMes == 6) {
			System.out.println("El mes tiene 30 días");
		}else if (numMes == 7) {
			System.out.println("El mes tiene 31 días");
		}else if (numMes == 8) {
			System.out.println("El mes tiene 31 días");
		}else if (numMes == 9) {
			System.out.println("El mes tiene 30 días");
		}else if (numMes == 10) {
			System.out.println("El mes tiene 31 días");
		}else if (numMes == 11) {
			System.out.println("El mes tiene 30 días");
		}else if (numMes == 12) {
			System.out.println("El mes tiene 31 días");
		}
	}

}
