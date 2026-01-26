package Ejercicios;

import java.util.Date;
import java.util.Scanner;

public class MainAlumnoEj15 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		Date fecha1 = new Date(1996 - 1900, 1, 5);
		Alumno alumno1 = new Alumno("Marcos", "Unzueta", fecha1);

		Date fecha2 = new Date(2004 - 1900, 6, 19);
		Alumno alumno2 = new Alumno("Álvaro", "Gómez", fecha2);

		System.out.println("Fechas: ");
		System.out.println("Alumno1: " + alumno1.mostrarFecha('/'));
		System.out.println("Alumno2: " + alumno2.mostrarFecha('-'));

		System.out.println("\n Letras del nombre:");
		System.out.println("Alumno1: " + alumno1.contarLetrasNombre());
		System.out.println("Alumno2: " + alumno2.contarLetrasNombre());

		System.out.println("\n Orden alfabético:");
		System.out.println("Alumno1 antes que Alumno2: "
				+ alumno1.ordenarAlumnos(alumno2.toString()));

		System.out.println("\n Introduce notas del alumno 1");
		alumno1.recogerNotas(sc);

		System.out.println("\n Introduce notas del alumno 2");
		alumno2.recogerNotas(sc);

		System.out.println("\n ¿Promociona?");
		System.out.println("Alumno 1 promociona: " + alumno1.alumnoPasaCurso());
		System.out.println("Alumno 2 promociona: " + alumno2.alumnoPasaCurso());

		System.out.println("\n Notas: ");
		System.out.println("Alumno 1 - Nota más alta: " + alumno1.calcularNotaMasAlta());
		System.out.println("Alumno 1 - Nota más baja: " + alumno1.calcularNotaMasBaja());

		System.out.println("Alumno 2 - Nota más alta: " + alumno2.calcularNotaMasAlta());
		System.out.println("Alumno 2 - Nota más baja: " + alumno2.calcularNotaMasBaja());

		System.out.println("\n Media");
		System.out.println("Media alumno 1: " + alumno1.calcularNotaMedia());
		System.out.println("Media alumno 2: " + alumno2.calcularNotaMedia());
		
		System.out.println("\n Comparación:");
		System.out.println("Alumno 1 tiene mejor media que alumno 2: "
				+ alumno1.compararAlumnos(alumno2));

		System.out.println("\n Representación de los datos:");
		System.out.println(alumno1);
		System.out.println(alumno2);

		sc.close();
	}
}
