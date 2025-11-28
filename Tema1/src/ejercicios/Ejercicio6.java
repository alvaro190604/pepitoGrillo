package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1;
		Scanner pedir = new Scanner (System.in);
		
		System.out.println("Dime tu año de nacimiento");
		var1 = pedir.nextInt();
		
		int var2;
		
		System.out.println("Dime tu mes de nacimiento");
		var2 = pedir.nextInt();
		
		int var3;
		
		System.out.println("Dime tu día de nacimiento");
		var3 = pedir.nextInt();
		pedir.close();

		System.out.println("La fecha de nacimiento es " + var3 + '/' + var2 + '/' + var1);
	}

}
