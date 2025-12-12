package Ejercicios;

import java.util.Scanner;

public class MainJugadorEj9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		String nombre1;
		String nombre2;
		int resultado1;
		int resultado2;
		int numeroJugador1, numeroJugador2;
		int turno = 0;

		System.out.println("Dime el primer nombre");
		nombre1 = teclado.next();
		System.out.println("Dime el segundo nombre");
		nombre2 = teclado.next();

		Jugador jugador1 = new Jugador(nombre1);
		Jugador jugador2 = new Jugador(nombre2);

		System.out.println("COMIENZA EL JUEGO");

		do {
			int numAle = (int) (Math.random() * 100) + 1;

			// DECIR TURNO
			turno++;
			System.out.println("---------- ");
			System.out.println("TURNO " + turno);
			System.out.println("---------- ");

			// PEDIR LOS NÚMEROS A LOS JUGADORES
			do {
				System.out.println(jugador1.getNombre() + " introduzca número : ");
				numeroJugador1 = teclado.nextInt();

				System.out.println(jugador2.getNombre() + " introduzca número : ");
				numeroJugador2 = teclado.nextInt();

			} while (numeroJugador1 < 1 || numeroJugador1 > 100 || numeroJugador2 < 1 || numeroJugador2 > 100);

			System.out.println("El número aleatorio era: " + numAle);

			// COMPROBAR QUIÉN ESTÁ MÁS LEJOS
			if (numeroJugador1 > numAle) {
				resultado1 = numeroJugador1 - numAle;
			} else if (numeroJugador1 < numAle) {
				resultado1 = numAle - numeroJugador1;
			} else {
				resultado1 = 0;
			}

			if (numeroJugador2 > numAle) {
				resultado2 = numeroJugador2 - numAle;
			} else if (numeroJugador2 < numAle) {
				resultado2 = numAle - numeroJugador2;
			} else {
				resultado2 = 0;
			}

			// QUITAR VIDA
			if (resultado1 > resultado2) {
				jugador1.reducirVida();
				System.out.println(jugador1.getNombre() + " pierde 10 puntos de vida");
			} else if (resultado1 < resultado2) {
				jugador2.reducirVida();
				System.out.println(jugador2.getNombre() + " pierde 10 puntos de vida");
			}
			// INDICAR VIDA DE LOS JUGADORES
			jugador1.imprimirVidaRestante();
			jugador2.imprimirVidaRestante();
		} while (!jugador1.haPerdidio() && !jugador2.haPerdidio());

		// DECIR GANADOR Y PERDEDOR
		if (jugador1.haPerdidio()) {
			System.out.println("Ha ganado " + jugador2.getNombre());
		} else {
			System.out.println("Ha ganado " + jugador1.getNombre());
		}
		teclado.close();
	}

}
