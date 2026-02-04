package Tema1_Tema2;

import java.util.Scanner;

public class MainLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		Libro libro1 = new Libro("Cenicienta", "autor1", true);
		Libro libro2 = new Libro("Superman", "autor2", true);
		Libro libro3 = new Libro("Mario", "autor3", true);

		Libro libros[] = new Libro[3];

		libros[0] = libro1;
		libros[1] = libro2;
		libros[2] = libro3;

		int opcion;
		do {
			System.out.println("Menú:");
			System.out.println("0) Salir");
			System.out.println("1) Mostrar información libros");
			System.out.println("2) Elegir libro para prestar o devolver");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 0:
				System.out.println("Hasta la próxima");
				break;
			case 1:
				mostrarInfoLibros(libros);
				break;
			case 2:
				int libroEscogido;
				do {
					System.out.println("Introduce un libro del 0 al 2");
					libroEscogido = teclado.nextInt();
				} while (libroEscogido < 0 || libroEscogido > 2);
				int opcion2;
				do {
					System.out.println("1) Prestar libro");
					System.out.println("2) Devolver libro");
					opcion2 = teclado.nextInt();
				} while (opcion2 < 1 || opcion2 > 2);
				switch (opcion2) {
					case 1:
						libros[libroEscogido].prestarLibro();
						System.out.println(libros[libroEscogido].toString());
						break;
					case 2:
						libros[libroEscogido].devolverLibro();
						System.out.println(libros[libroEscogido].toString());
						break;

				default:
					System.out.println("Opción no válida");
					break;
				}
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}

		} while (opcion != 0);

	}

	public static void mostrarInfoLibros(Libro[] libros) {
		for (int i = 0; i < libros.length; i++) {
			System.out.println(libros[i].toString());
		}
	}

}
