package Tema1_Tema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio;
		int cantidad;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime cuánto cuesta");
		precio = teclado.nextDouble();

		System.out.println("Dime la cantidad");
		cantidad = teclado.nextInt();
		teclado.close();

		precio = precio * cantidad;
				
		if (cantidad < 5) {
			System.out.println("No hay descuento");
			System.out.println("El precio es: " + precio);
			System.out.println("El precio a pagar es: " + precio);
		} else if (cantidad >= 5 && cantidad <= 10) {
			double descuento = precio * 0.1;
			double precioFinal = precio - descuento;
			System.out.println("El precio sin descuento es: " + precio);
			System.out.println("El descuento es: " + descuento);
			System.out.println("El precio a pagar es: " + precioFinal);
		} else  {
			double descuento = precio * 0.2;
			double precioFinal = precio - descuento;
			System.out.println("El precio sin descuento es: " + precio);
			System.out.println("El descuento es: " + descuento);
			System.out.println("El precio a pagar es: " + precioFinal);
		}
	}

}
