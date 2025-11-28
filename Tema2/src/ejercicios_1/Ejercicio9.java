package ejercicios_1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia, mes;
		boolean fechaBien = true;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el día de nacimiento");
		dia = teclado.nextInt();
		
		System.out.println("Dime el mes de nacimiento");
		mes = teclado.nextInt();
		teclado.close();
		  
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			if (dia < 1 || dia > 31) { System.out.println("El día es incorrecto");
			fechaBien = false;
			}
			break;
		case 4, 6, 9, 11:
			if (dia < 1 || dia > 30) { System.out.println("El día es incorrecto");
			fechaBien = false;
			}
			break;
		case 2:
			if (dia < 1 || dia > 29) { System.out.println("El día es incorrecto");
			fechaBien = false;
			}
			break;
		default:
			System.out.println("El mes no existe");
			fechaBien = false;
			break;
		}
		if (fechaBien == true) {
		
		if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
			System.out.println("Eres Aries");
		}
		else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) {
			System.out.println("Eres Tauro");
		}
		else if ((dia >= 21 && mes == 5) || (dia <= 20 && mes == 6)) {
			System.out.println("Eres Géminis");
		}
		else if ((dia >= 21 && mes == 6) || (dia <= 22 && mes == 7)) {
			System.out.println("Eres Cáncer");
		}
		else if ((dia >= 23 && mes == 7) || (dia <= 22 && mes == 8)) {
			System.out.println("Eres Leo");
		}
		else if ((dia >= 23 && mes == 8) || (dia <= 22 && mes == 9)) {
			System.out.println("Eres Virgo");
		}
		else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
			System.out.println("Eres Libra");
		}
		else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
			System.out.println("Eres Escorpio");
		}
		else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
			System.out.println("Eres Sagitario");
		}
		else if ((dia >= 22 && mes == 12) || (dia <= 19 && mes == 1)) {
			System.out.println("Eres Capricornio");
		}
		else if ((dia >= 20 && mes == 1) || (dia <= 18 && mes == 2)) {
			System.out.println("Eres Acuario");
		} 
		else if ((dia >= 19 && mes == 2) || (dia <= 20 && mes == 3)) {
			System.out.println("Eres Piscis");
		}
		else System.out.println("Fecha incorrecta");
		}
		}
}
