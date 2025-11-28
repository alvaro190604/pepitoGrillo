package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime la nota que ha sacado el alumno");
		nota = teclado.nextDouble();
		teclado.close();
		
		boolean resultado = nota >= 5;
		
		System.out.println("El alumno ha aprobado? " + resultado);
	}

}
