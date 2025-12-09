package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el radio");
		radio = teclado.nextDouble();
		teclado.close();
		
		double resultado1 = 2 * Math.PI + radio;
		double resultado2 = Math.PI * Math.pow(radio,2);
		
		System.out.println("El área sería: " + resultado2 + "\n" + "La longitud sería: " + resultado1);
	}

}
