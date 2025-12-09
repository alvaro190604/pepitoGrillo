package Tema1_Tema2;

import java.util.Scanner;

public class EjercicioCruzGriega {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner teclado = new Scanner (System.in);
		
		
		do {
			System.out.println("Dime un número impar");
			num = teclado.nextInt();
		} while (num % 2 == 0);
		
		for (int i = 0; i < num; i++) {
			System.out.println();
			for (int j = 0; j < num; j++) {
				if (i == num / 2 || j == num / 2) {
					System.out.print('*');
				} else {
					System.out.print(" ");
				}
				
			} 
		}
		
		
	}

}
