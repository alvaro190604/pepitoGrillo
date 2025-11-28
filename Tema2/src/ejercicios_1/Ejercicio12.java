package ejercicios_1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, calculado;
		boolean correcto = true;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número del DNI");
		numero = teclado.nextInt();
		teclado.close();
		
		calculado = (numero - ((numero / 23) * 23));
		
		if (numero < 10000000 || numero > 99999999) {System.out.println("Numero no válido");
		correcto = false;
		}
		if (correcto == true) {
		switch (calculado) {
		case 0:
			System.out.println("Tu DNI es: " + numero + "T");			
			break;
		case 1:
			System.out.println("Tu DNI es: " + numero + "R");			
			break;
		case 2:
			System.out.println("Tu DNI es: " + numero + "W");			
			break;
		case 3:
			System.out.println("Tu DNI es: " + numero + "A");			
			break;
		case 4:
			System.out.println("Tu DNI es: " + numero + "G");			
			break;
		case 5:
			System.out.println("Tu DNI es: " + numero + "M");			
			break;
		case 6:
			System.out.println("Tu DNI es: " + numero + "Y");			
			break;
		case 7:
			System.out.println("Tu DNI es: " + numero + "F");			
			break;
		case 8:
			System.out.println("Tu DNI es: " + numero + "P");			
			break;
		case 9:
			System.out.println("Tu DNI es: " + numero + "D");			
			break;
		case 10:
			System.out.println("Tu DNI es: " + numero + "X");			
			break;
		case 11:
			System.out.println("Tu DNI es: " + numero + "B");			
			break;
		case 12:
			System.out.println("Tu DNI es: " + numero + "N");			
			break;
		case 13:
			System.out.println("Tu DNI es: " + numero + "J");			
			break;
		case 14:
			System.out.println("Tu DNI es: " + numero + "Z");			
			break;
		case 15:
			System.out.println("Tu DNI es: " + numero + "S");			
			break;
		case 16:
			System.out.println("Tu DNI es: " + numero + "Q");			
			break;
		case 17:
			System.out.println("Tu DNI es: " + numero + "V");			
			break;
		case 18:
			System.out.println("Tu DNI es: " + numero + "H");			
			break;
		case 19:
			System.out.println("Tu DNI es: " + numero + "L");			
			break;
		case 20:
			System.out.println("Tu DNI es: " + numero + "C");			
			break;
		case 21:
			System.out.println("Tu DNI es: " + numero + "K");			
			break;
		case 22:
			System.out.println("Tu DNI es: " + numero + "E");			
			break;
		default: System.out.println("El número no es un DNI");
			break;
		}
		}
	}

}
