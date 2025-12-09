package ExamenAñoPasado;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		double uno, dos, tres, cuatro, cinco;
		double suma = 0;

		System.out.println("introduce un numero entre el 100 y el 99999: ");
		num = sc.nextInt();

		if (num < 100 || num > 99999) {
			System.out.println("numero no valido");
		} else if (num > 10000 && num <= 99999) {
			uno = num % 10;
			System.out.println(uno);
			dos = (num / 10) % 10;
			System.out.println(dos);
			tres = (num / 100 % 10);
			System.out.println(tres);
			cuatro = (num / 1000 % 10);
			System.out.println(cuatro);
			cinco = (num / 10000 % 10);
			System.out.println(cinco);

			suma = Math.pow(cinco, 5) + Math.pow(cuatro, 5) + Math.pow(tres, 5) + Math.pow(dos, 5) + Math.pow(uno, 5);
			System.out.println(suma);

		} else if (num > 1000 && num <= 9999) {
			uno = num % 10;
			System.out.println(uno);
			dos = (num / 10) % 10;
			System.out.println(dos);
			tres = (num / 100 % 10);
			System.out.println(tres);
			cuatro = (num / 1000 % 10);
			System.out.println(cuatro);

			suma = Math.pow(cuatro, 4) + Math.pow(tres, 4) + Math.pow(dos, 4) + Math.pow(uno, 4);
			System.out.println(suma);
			
		} else if (num > 100 && num <= 999) {
			uno = num % 10;
			System.out.println(uno);
			dos = (num / 10) % 10;
			System.out.println(dos);
			tres = (num / 100 % 10);
			System.out.println(tres);

			suma = Math.pow(tres, 3) + Math.pow(dos, 3) + Math.pow(uno, 3);

			System.out.println(suma);
		}
		
		if (num == suma) {
			System.out.println("el numero es narcisista");
		}else {
			System.out.println("el numero no es narcisista");
		}
		sc.close();
		
	}
}
