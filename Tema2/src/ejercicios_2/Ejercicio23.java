package ejercicios_2;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime el número");
		num = teclado.nextInt();
		while (num > 10) { // Significa que el numero final de la suma de los digitos de la operacion
							// actual esta formado por mas de un digito
			int suma = 0;
			int temporal = num;
			while (temporal > 0) {
				int resto = temporal % 10;
				temporal = temporal / 10;
				suma = suma + resto;
			}
			num = suma;
		}
		System.out.println(num);
		; // Resultadp final

	}

}
