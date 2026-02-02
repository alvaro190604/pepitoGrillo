package Tema1_Tema2;

import java.util.Scanner;

public class MainLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		Libro libro = new Libro ();

		String libros [] = {"El mago de OZ", "El Quijote", "La Biblia"};
		
		int opcion;
		do {
			System.out.println("Menú:");
			System.out.println("0) Salir");
			opcion = teclado.nextInt();
			System.out.println("1) Mostrar información libros");
			opcion = teclado.nextInt();
			System.out.println("2) Elegir libro");
			opcion = teclado.nextInt();
			System.out.println("3) Prestar libro");
			opcion = teclado.nextInt();
			System.out.println("4) Devolver libro");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 0:
				System.out.println("Hasta la próxima");
				break;
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
			
		} while (opcion != 0);
		
	}

}
