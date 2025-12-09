package EjerciciosEstaticos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes, anio;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el mes");
		mes = teclado.nextInt();
		
		System.out.println("Dime el año");
		anio = teclado.nextInt();
		
		imprimirCalendario(anio, mes);
		System.out.println();
		
	}
	public static void imprimirCalendario (int anio, int mes) {
		Ejercicio2.numeroDeDiasMesAnio(anio, mes);
		System.out.println("		"+imprimirMes(mes)+" , "+anio);
		System.out.println("L	M	X	J	V	S	D");
		int dia = 1;
		int contador = 0;
		for (int j = 1; j < diaComienzoMes(anio, mes); j++) {
			System.out.print("\t");
			contador++;
		}
		for (int i = dia ; i <= Ejercicio2.numeroDeDiasMesAnio(anio, mes) ; i++) {
			System.out.print(i + "	");
			contador++;
			if (contador == 7) {
				System.out.println();
				contador = 0;
			}
		} 
	}
	public static String imprimirMes (int mes) {
		switch (mes) {
		case 1:
			return "Enero";
		case 2:
			return "Febrero";
		case 3:
			return "Marzo";
		case 4:
			return "Abril";
		case 5:
			return "Mayo";
		case 6:
			return "Junio";
		case 7:
			return "Julio";
		case 8:
			return "Agosto";
		case 9:
			return "Septiembre";
		case 10:
			return "Octubre";
		case 11:
			return "Noviembre";
		case 12:
			return "Diciembre";
		default:
			return "Mes no válido";
		}
	}
	public static int diaComienzoMes (int anio, int mes) {
		int diaC;
		if (mes == 1 || mes == 2) {
			diaC = (anio+31*(mes-1)+(anio-1)/4-3*((anio+99)/100)/4)%7;
		} else {
			diaC = (anio+31*(mes-1)-(4*mes+23)/10+anio/4-(3*(anio/100+1))/4)%7;
		}
		
		if(diaC == 0) {
			return 7;
		}
		
		return diaC;
	}
}

