package Tema1_Tema2;

import java.util.Scanner;

public class ContarDigitosInparesYPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime un número");
		num = teclado.nextInt();
		System.out.println("La cantidad de pares del numero son: " + obtenerDigitos(num, "par"));
		System.out.println("La cantidad de impares del numero son: " + obtenerDigitos(num, "impar"));

		
	}

	public static int obtenerDigitos (int num, String opcion) {
		if (num > 0) {
			if (opcion == "par" || opcion == "impar") {
				switch (opcion) {
				case "par":
					int par = 0;
					while (num > 0) {
						int resto = num % 10;
						if (resto % 2 == 0) {
							par++;
						}
						num = num / 10;
					}
					return par;
				case "impar":
					int impar = 0;
					while (num > 0) {
						int resto = num % 10;
						if (resto % 2 != 0) {
							impar++;
						}
						num = num / 10;
					}
					return impar;
				}
			}
		}
		return -1;
	}
}
