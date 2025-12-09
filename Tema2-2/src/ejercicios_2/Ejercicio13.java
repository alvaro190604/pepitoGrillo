package ejercicios_2;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota;
		int suspenso = 0;
		int suficiente = 0;
		int bien = 0;
		int notable = 0;
		int sobresaliente = 0;
		int notas = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		do { 
			System.out.println("Dime las notas");
			nota = teclado.nextInt();
			
			if (nota >= 0 && nota <= 4) {
				suspenso++;
				notas++;
			}
			else if (nota == 5) {
				suficiente++;
				notas++;
			}
			else if (nota == 6) {
				bien++;
				notas++;
			}
			else if (nota >= 7 && nota <= 8) {
				notable++;
				notas++;
			}
			else if (nota >= 9 && nota <= 10) {
				sobresaliente++;
				notas++;
			}
		} while (notas < 10);
		System.out.println(
				"Suspenso = " + suspenso + "\n" +
				"Suficiente = " + suficiente + "\n" +
				"Bien = " + bien + "\n" +
				"Notable = " + notable + "\n" +
				"Sobresaliente = " + sobresaliente);
	}

}
