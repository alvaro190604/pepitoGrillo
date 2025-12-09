package ejercicios_1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigoPostal;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número del código postal");
		codigoPostal = teclado.nextInt();
		teclado.close();
		
		switch (codigoPostal ) {
		case 370001, 370002, 370003, 370004, 370005, 370006, 370007, 370008:
			System.out.println("El código es de Salamanca");
			break;
		default: System.out.println("El código no es de Salamanca");
		}
	}

}
