package ejercicios;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bolsas;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número de bolsas de doritos");
		bolsas = teclado.nextInt();
		teclado.close();
		
		double descuento = (bolsas * ((3.65 * 30) / 100));
		double precio = ((bolsas * 3.65) - descuento);
		
		System.out.println("Se han comprado " + bolsas + " bolsas por " 
		+ precio + "€ y nos hemos ahorrado " + descuento + "€");
	}

}
