package ExamenAñoPasado;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dias, horas, min, seg;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número de días");
		dias = teclado.nextInt();
		
		System.out.println("Dime el número de horas");
		horas = teclado.nextInt();
		
		System.out.println("Dime el número de minutos");
		min = teclado.nextInt();
		
		System.out.println("Dime el número de segundos");
		seg = teclado.nextInt();
		
		if (dias >= 0 && horas >= 0 && min >= 0 && seg >= 0) {
			
			int seg1 = seg / 60;
			seg = seg % 60;
			
			int min1 = min / 60;
			min = min % 60;
			min = min + seg1;
			
			int horas1 = horas / 24;
			horas = horas % 24;
			horas = horas + min1;
			
			dias = dias + horas1;
			
			System.out.println("El valor normalizado es: " + dias + " días, " + horas + " horas, " + min + " minutos, " + seg + " segundos.");
			
		} else {
			System.out.println("Los valores introducidos no son válidos");
		}
		
	}

}
