package ExamenObjetos;

import java.util.Scanner;

public class MainJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jugador jugador = new Jugador ("Alvaro", 5000);
		
		Scanner teclado = new Scanner (System.in);
		
		char opcion;
		int dinero;
		int numero;
		
		do {
			
			System.out.println("Si quieres seguir pulsa S, sino pulsa N");
			opcion = teclado.next().charAt(0);
			
			if (opcion == 'N' || opcion == 'n') {
				break;
			}
			
			jugador.infoJugador();
			
			System.out.println("Si quieres apostar a par o impar, escribe P, si quieres apostar a cualquier número escribe C");
			opcion = teclado.next().charAt(0);
			
			do {
				
				System.out.println("Cuánto dinero quieres apostar??");
				dinero = teclado.nextInt();
				
			} while (dinero > jugador.getDineroActual());
			
			int numAle = (int) (Math.random() * 27);
			
			if (opcion == 'P' || opcion == 'p') {
				System.out.println("Si quieres apostar a par pulsa P, si quieres apostar a impar pulsa I");
				opcion = teclado.next().charAt(0);
				
				if (opcion == 'P' || opcion == 'p') {
					
					if (numAle % 2 == 0) {
						// Gana par
						jugador.ganarParImpar(dinero);
					} else {
						// Pierde par
						jugador.perder(dinero);
					}
					
				} else {
					if (numAle % 2 != 0) {
						//Gana impar
						jugador.ganarParImpar(dinero);
					} else {
						//Pierde impar
						jugador.perder(dinero);
					}
				}
				
			} else {
				System.out.println("Elige un número entre el 0 y el 26");
				numero = teclado.nextInt();
				
				if (numero == numAle) {
					//Gana numero
					jugador.ganarNumero(dinero);
				} else {
					//Pierde numero
					jugador.perder(dinero);
				}
			}
			
			System.out.println("El número aleatorio era: " + numAle);
			jugador.infoJugador();
			
		} while (jugador.getDineroActual() > 0);
		
		System.out.println("El programa ha terminado");
		teclado.close();
		
	}

}
