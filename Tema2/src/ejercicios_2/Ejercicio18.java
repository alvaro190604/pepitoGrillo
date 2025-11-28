package ejercicios_2;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		int n1;
		int n2;
		int resultado = 0;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Dime la opción que quieres ejecutar: " + "\n" + "0 Salir" + "\n" + "1 Suma" + "\n"
					+ "2 Resta" + "\n" + "3 Multiplicación" + "\n" + "4 División");
			System.out.println("");
			opcion = teclado.nextInt();
			
			if (opcion != 0) {
			System.out.println("Dime el primer número");
			n1 = teclado.nextInt();

			System.out.println("Dime el segundo número");
			n2 = teclado.nextInt();
			
				
			switch (opcion) {
			case 0: {
				System.out.println("Programa terminó");
				break;
			}
			case 1: {
				resultado = (n1 + n2);
				System.out.println(n1 + " + " + n2 + " = " + resultado);
				break;
			}
			case 2: {
				resultado = (n1 - n2);
				System.out.println(n1 + " - " + n2 + " = " + resultado);
				break;
			}
			case 3: {
				resultado = (n1 * n2);
				System.out.println(n1 + " * " + n2 + " = " + resultado);
				break;
			}
			case 4: {
				if (n2 == 0) {
					System.out.println("No se puede dividir 0");
				}else {
				resultado = (n1 / n2);
				System.out.println(n1 + " / " + n2 + " = " + resultado);
				}
			}

			default:
				System.out.println("Número no válido, inténtalo de nuevo");
			}
			}
		} while (opcion != 0);

	}
		
}
