package ejercicios_2;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		int edadMax = 0;
		int edadMin = 100;
		String nombre, nombreMax = "", nombreMin = "";
		int edades = 0;
		int contador = 0;
		int edadMedia = 0;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Dime la edad del alumno");
			edad = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Dime su nombre");
			nombre = teclado.nextLine();

			if (edad >= 1 && edad <= 99) {
				
				contador++;
				edades = edades + edad;
				if (edad > edadMax) {
					edadMax = edad;
					nombreMax = nombre;
				}
				
				if (edad < edadMin) {
					edadMin = edad;
					nombreMin = nombre;

				}
			} else {
				System.out.println("Edad no válida");
			}			 
			
		} while (edad != 0);
		
		edadMedia = edades / contador;
		
		teclado.close();
		System.out.println("El más mayor es: " + nombreMax + " con " + edadMax + " años." + "\n" + 
							"El más pequeño es: " + nombreMin + " con " + edadMin + " años." + "\n" +
							"La edad media es: " + edadMedia);

	}

}