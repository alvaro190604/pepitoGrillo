package ejercicios_1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número");
		num = teclado.nextInt();
		teclado.close();
		
		if (num >= 0 && num <= 9) {
			System.out.println("El número tiene 1 cifras");
		}
		else if (num >= 10 && num <= 99) {
			System.out.println("El número tiene 2 cifras");
		}
		else if (num >= 100 && num <= 999) {
			System.out.println("El número tiene 3 cifras");
		}
		else if (num >= 1000 && num <= 9999) {
			System.out.println("El número tiene 4 cifras");
		}
		else {System.out.println("Mi rango de lectura no es tan alto/bajo");
		}
	}

}
