package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner sca = new Scanner(System.in);
		System.out.println("Introduca un numero");
		numero = sca.nextInt();
		sca.close();
		
		String multiplo = ((numero % 5) == 0) ? "Es multiplo de 5" : "No es múltiplo de 5";
		
		System.out.println(multiplo);
	}

}
