package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner sca = new Scanner(System.in);
		System.out.println("Introduca un numero");
		numero = sca.nextInt();
		sca.close();
		
		String posneg = numero >= 0 ? "El número es positivo" : "El número es negativo";
		
		System.out.println(posneg);
	}

}
