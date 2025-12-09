package ejercicios_1;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double examen1, examen2, examen3, practicas, nota1, notaFinal;
		boolean notaExamenes = true;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime la nota del primer examen");
		examen1 = teclado.nextDouble();
		
		System.out.println("Dime la nota del segundo examen");
		examen2 = teclado.nextDouble();
		
		System.out.println("Dime la nota del tercer examen");
		examen3 = teclado.nextDouble();
		
		System.out.println("Dime la nota de las prácticas");
		practicas = teclado.nextDouble();		
		teclado.close();
		
		nota1 = (examen1 + examen2 + examen3) / 3;
		
		if (nota1 < 5) {
			System.out.println("Lo sentimos, has suspendido el examen"); 
			notaExamenes = false;
		}
		
		notaFinal = (((nota1 * 40) / 100) + ((practicas * 60) / 100)); 
		
		if (notaExamenes == true) {
		
			if (notaFinal < 5) {
				System.out.println("Suspenso");
			}
			else if (notaFinal >= 5 && notaFinal < 6) {
				System.out.println("Suficiente");
			}
			else if (notaFinal >= 6 && notaFinal < 7) {
				System.out.println("Bien");
			}
			else if (notaFinal >= 7 && notaFinal < 9) {
				System.out.println("Notable");
			}
			else if (notaFinal >= 9 && notaFinal <= 10) {
				System.out.println("Sobresaliente");
			}
			else {
				System.out.println("Nota no válida");
			}
		}
	}

}
