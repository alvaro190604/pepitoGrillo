package ExamenAñoPasado;

import java.util.Scanner;

public class orngd {

	public static void main(String[] args) {
		// Álvaro Gómez Alonso
		int dias, horas, min, seg;
		int seg2 = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime los dias");
		dias = teclado.nextInt();
		
		System.out.println("Dime las horas");
		horas = teclado.nextInt();
		
		System.out.println("Dime los minutos");
		min = teclado.nextInt();
		
		System.out.println("Dime los segundos");
		seg = teclado.nextInt();
		teclado.close();
		
		if (horas < 24 && horas > 0 && min < 60 && min >= 0 && seg2 < 60 && seg2 >= 0) {
			
			int seg1 = seg / 60;
			seg = seg % 60;
			seg2 = seg + 1;
			
			int min1 = min / 60;
			min = min % 60;
			min = seg + seg1;
			
			int horas1 = horas / 24;
			horas = horas % 24;
			horas = horas + min1;
			
			dias = dias + horas1;
			
			if (seg2 > 59) {
				seg2 = 0;
				min = min + 1;
			}
			if (min > 59) {
				min = 0;
				horas = horas + 1;
			}
			if (horas > 23) {
				horas = 0;
				dias = dias + 1;
			}
			
			System.out.println(dias + "," + horas + "," + min + "," + seg2);
		} else {
			System.out.println("Valores introducidos ");
		}
	}

}

