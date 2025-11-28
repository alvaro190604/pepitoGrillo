package ejercicios_1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dinero;
		double calculo = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime cuánto tiene que pagar de impuestos");
		dinero = teclado.nextInt();
		teclado.close();
		
		if (dinero >= 0 && dinero <=12449) {
			calculo = (dinero * 0.19);
		}
		else if (dinero >= 12450 && dinero <=20199) {
			calculo = (dinero * 0.24);
		}
		else if (dinero >= 20200 && dinero <=35199) {
			calculo = (dinero * 0.30);
		}
		else if (dinero >= 35200 && dinero <=59999) {
			calculo = (dinero * 0.37);
		}
		else if (dinero >= 60000 && dinero <=299999) {
			calculo = (dinero * 0.45);
		}
		else if (dinero >= 300000) {
			calculo = (dinero * 0.47);
		}
		else { System.out.println("Cantidad no válida");
		}
		
		System.out.println("Tienes que pagar en impuestos: " + calculo);
	}
}
