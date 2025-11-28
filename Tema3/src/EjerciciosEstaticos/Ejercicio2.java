package EjerciciosEstaticos;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean fechaBien = true;
		int dia, mes, anio;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el día");
		dia = teclado.nextInt();
		
		System.out.println("Dime el mes");
		mes = teclado.nextInt();
		
		System.out.println("Dime el año");
		anio = teclado.nextInt();
		teclado.close();
		
		fechaBien = comprobarFecha(dia, mes, anio);
		
		if (fechaBien == true) {
			int dias = calcularDiaDelAnio(mes, dia);
			System.out.println("Es el día " + dias + " del año");
			
			int anio1 = calcularDiaDelAnio2(anio, mes, dia);
			System.out.println("Es el día " + anio1 + " del año");

			boolean diasDelMes = fechaDiaMes(dia, mes);
			System.out.println("La fecha es correcta: " + diasDelMes);

			boolean diasMesAño = fechaDiaMesAnio(dia, mes, anio);
			System.out.println("La fecha es correcta: " + diasMesAño);
		} else {
			System.out.println("La fecha es incorrecta");
		}
		
	}
	
	public static boolean comprobarFecha(int dia, int mes, int anio) {
		if (mes < 1 || mes > 12 || dia < 1 || dia > numeroDeDiasMesAnio(anio, mes)) {
			return false;
		} else return true;
	}

	public static int calcularDiaDelAnio2(int anio, int mes, int dia) {
		int numeroDias = 0;

		for (int i = 1; i < mes; i++) {
			numeroDias = numeroDias + numeroDeDiasMesAnio(anio, i);
		}

		numeroDias = numeroDias + dia;
		return numeroDias;
	}

	public static int calcularDiaDelAnio(int mes, int dia) {
		int numeroDias = 0;

		for (int i = 1; i < mes; i++) {
			numeroDias = numeroDias + numeroDeDiasMes(i);
		}

		numeroDias = numeroDias + dia;
		return numeroDias;
	}

	public static boolean fechaDiaMes(int dia, int mes) {

		if (mes < 1 || mes > 12 || dia < 1 || dia > numeroDeDiasMes(mes)) {
			return false;
		}

		return true;
	}

	public static boolean fechaDiaMesAnio(int dia, int mes, int anio) {

		if (mes < 1 || mes > 12 || dia < 1 || dia > numeroDeDiasMesAnio(anio, mes)) {
			return false;
		}

		return true;
	}

	public static int numeroDeDiasMesAnio(int anio, int mes) {

		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 2:
			if (anio % 4 == 0) {
				return 29;
			}
			return 28;
		case 4, 6, 9, 11:
			return 30;
		default:
			return -1;
		}
	}

	public static int numeroDeDiasMes(int mes) {
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 2:
			return 28;
		case 4, 6, 9, 11:
			return 30;
		default:
			return -1;
		}
	}

}
