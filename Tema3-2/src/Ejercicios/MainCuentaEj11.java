package Ejercicios;

import java.util.Scanner;

public class MainCuentaEj11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		char divisaActual = '€';
		boolean cambiar;
		
		Scanner teclado = new Scanner (System.in);
		
		Cuenta cuenta = new Cuenta ("Paco", 2000, '€');
		
		double aux = cuenta.getDinero();
		
		do {
		System.out.println("---MENU---");
		System.out.println("0) Salir");
		System.out.println("1) Mostrar dinero actual");
		System.out.println("2) Cambiar a $");
		System.out.println("3) Cambiar a €");
		System.out.println("4) Cambiar a L");
		
		System.out.println("Dime la opción que deseas realizar");
		opcion = teclado.nextInt();
		
		switch (opcion) {
		case 0:
			System.out.println("Has salido del programa");
			break;
		case 1:
			System.out.println(cuenta);
			break;
		case 2:
			System.out.println(cuenta);
			if (divisaActual == '$') {
				System.out.println("Error");
			} else {
				cuenta.pasarADolares();
				System.out.println(cuenta.getDinero());
				System.out.println("Desea realizar la conversión?");
				cambiar = teclado.nextBoolean();
				if (cambiar == true) {
					cuenta.setDivisa('$');
					aux = cuenta.getDinero();
					divisaActual = '$';
				} else {
					cuenta.setDinero(aux);
				}
			}
			break;
		case 3:
			System.out.println(cuenta);
			if (divisaActual == '€') {
				System.out.println("Error");
			} else {
				cuenta.pasarAEuros();
				System.out.println(cuenta.getDinero());
				System.out.println("Desea realizar la conversión?");
				cambiar = teclado.nextBoolean();
				if (cambiar == true) {
					cuenta.setDivisa('€');
					aux = cuenta.getDinero();
					divisaActual = '€';
				} else {
					cuenta.setDinero(aux);
				}
			}
			break;
		case 4:
			System.out.println(cuenta);
			if (divisaActual == 'L') {
				System.out.println("Error");
			} else {
				cuenta.pasarALibras();
				System.out.println(cuenta.getDinero());
				System.out.println("Desea realizar la conversión?");
				cambiar = teclado.nextBoolean();
				if (cambiar == true) {
					cuenta.setDivisa('L');
					aux = cuenta.getDinero();
					divisaActual = 'L';
				} else {
					cuenta.setDinero(aux);
				}
			}
		}
		
		} while (opcion != 0);
		teclado.close();
	}

}
