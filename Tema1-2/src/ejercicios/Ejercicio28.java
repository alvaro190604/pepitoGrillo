package ejercicios;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inversion;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime la inversión");
		inversion = teclado.nextDouble();
		teclado.close();
		
		double precio1 = inversion + (inversion * 4) / 100;
			int precio11 = (int) precio1;
		double precio2 = precio1 + (precio1 * 4) / 100;
			int precio12 = (int) precio2;
		double precio3 = precio2 + (precio2 * 4) / 100;
			int precio13 = (int) precio3;
		double precio4 = precio3 + (precio3 * 4) / 100;
			int precio14 = (int) precio4;
		
		System.out.println("El primer año: " + precio11 + "\n" + 
		"El segundo año: " + precio12 + "\n" + "El cuarto año: "+ precio14);
	}

}
