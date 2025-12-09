package ejercicios_2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numSup;
		int numInf;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número más bajo");
		numInf = teclado.nextInt();
		
		System.out.println("Dime el número más alto");
		numSup = teclado.nextInt();	
		teclado.close();
		
		if (numInf > numSup) {
			int aux = numInf;
			numInf = numSup;
			numSup = aux;
		}
		
		for (int i = numInf; i <= numSup; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
