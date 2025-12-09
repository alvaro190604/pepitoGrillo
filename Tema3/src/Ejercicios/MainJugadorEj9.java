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
		
		System.out.println("Dime el primer nombre");
		nombre1 = teclado.next();
		System.out.println("Dime el segundo nombre");
		nombre2 = teclado.next();
		
		Jugador jugador1 = new Jugador(nombre1);
		Jugador jugador2 = new Jugador(nombre2);
		
		
		do {
			int numAle = (int) (Math.random() * 100) + 1;
			
			//DECIR TURNO
			
			//PEDIR LOS NÚMEROS A LOS JUGADORES
			do {
			System.out.println(jugador1.getNombre() + " introduzca número Jugador1");
			numeroJugador1 = teclado.nextInt();
			
			System.out.println(jugador2.getNombre() + " introduzca número Jugador2");
			numeroJugador2 = teclado.nextInt(); 
			} while (numeroJugador1 < 1 || numeroJugador1 > 100 || numeroJugador2 < 1 || numeroJugador2 > 100);
			System.out.println("El número aleatorio es: " + numAle);
			//COMPROBAR QUIÉN ESTÁ MÁS LEJOS
			
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
			
			System.out.println(resultado1 + " y " + resultado2);
			
			if (resultado1 > resultado2) {
				
			}
			//INDICAR VIDA DE LOS JUGADORES
		}while(jugador1.haPerdidio() || jugador2.haPerdidio());

		//DECIR GANADOR Y PERDEDOR
	}

}
