package Tema1_Tema2;

import java.util.Scanner;

public class Ej19repasoBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		Scanner teclado = new Scanner  (System.in);
		do {
		System.out.println("Dime el número entre 2 y 100");
		numero = teclado.nextInt();
		} while (numero < 1 || numero > 100);
			
		for (int i = 1;i <= numero; i++){
				
				for (int j = 1;j <= i; j++) {
					
					System.out.print( j );
				}
				System.out.println();
			}
					
		}

}
