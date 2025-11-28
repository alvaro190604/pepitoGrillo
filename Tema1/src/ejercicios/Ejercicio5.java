package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float var1;
		Scanner pedir = new Scanner (System.in);
		
		System.out.println("Dime un número decimal");
		var1 = pedir.nextFloat();
		pedir.close();
		System.out.println("El número es " + var1);
				
	}

}
