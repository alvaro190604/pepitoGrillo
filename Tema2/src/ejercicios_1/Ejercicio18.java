package ejercicios_1;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora, min, seg;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número de la hora");
		hora = teclado.nextInt();
		
		System.out.println("Dime el número del minutero");
		min = teclado.nextInt();
		
		System.out.println("Dime el número del segundero");
		seg = teclado.nextInt();
		teclado.close();
		
		if (hora <= 23 && hora >= 0 && min <= 59 && min >= 0 && seg <= 59 && seg >= 0) {
			seg = seg + 1;
		
			if (seg > 59) {
				min = min + 1;
				seg = 0;
			}
			if (min > 59) {
				hora = hora + 1;
				min = 0;
			}
			if (hora > 23) {
				hora = 0;
				min = 0;
				seg = 0;
			}
		} else {
			System.out.println("La hora no existe");
		}
		System.out.println(hora + ":" + min + ":" + seg);
	}

}
