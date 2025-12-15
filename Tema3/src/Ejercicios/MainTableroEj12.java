package Ejercicios;

import java.util.Scanner;

public class MainTableroEj12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String respuesta1;
		int respuesta2, respuesta3;

		Tablero tablero = new Tablero();

		System.out.println(tablero.getP());

		// System.out.println("TABLERO (" + Punto.getX + " , " + Punto.getY );

		tablero.imprimirTablero();

		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Desea desplazar el punto?");
		respuesta1 = teclado.next();

		if (respuesta1.equals("si")) {
			System.out.println("Dime el desplazamiento de X");
			respuesta2 = teclado.nextInt();
			tablero.desplazarEnX(respuesta2);

			System.out.println("Dime el desplazamiento de Y");
			respuesta3 = teclado.nextInt();
			tablero.desplazarEnY(respuesta3);

			System.out.println(tablero.getP());

			tablero.imprimirTablero();

		} else {
			tablero.imprimirTablero();
		}

		System.out.println("¿Quiere saber la distancia euclidea del punto hacia otro?");
		respuesta1 = teclado.next();

		if (respuesta1.equals("si")) {
			System.out.println("Dime la posicion X");
			respuesta2 = teclado.nextInt();

			System.out.println("Dime la posicion Y");
			respuesta3 = teclado.nextInt();

			System.out.println(tablero.getP());

			tablero.imprimirTablero();
			System.out.println(
					"La distancia euclídea del punto " + tablero.getP().toString() + "con el punto (" + respuesta2 + ","
							+ respuesta3 + ") es: " + tablero.imprimirDistanciaEuclidea(respuesta2, respuesta3));

		} else {
			tablero.imprimirTablero();
		}

		System.out.println(tablero.getP());
	}

}
