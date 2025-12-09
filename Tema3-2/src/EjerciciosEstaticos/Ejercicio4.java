package EjerciciosEstaticos;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Dime el número");
		num = teclado.nextInt();

		System.out.println("El resultado del binario: " + calcularBinario(num));
		System.out.println("El resultado del octal: " + calcularOctal(num));
		System.out.println("El resultado del hexadecimal: " + calcularHexadecimal(num));
		teclado.close();
	}

	public static String calcularBinario(int num) {
		if (num == 0) {
			return "0";
		}
		String resultado = "";
		int resto = 0;
		while (num > 0) {
			resto = num % 2;
			num = num / 2;
			resultado = resto + resultado;
		}
		return resultado;
	}

	public static String calcularOctal(int num) {
		if (num == 0) {
			return "0";
		}
		String resultado = "";
		int resto = 0;
		while (num > 0) {
			resto = num % 8;
			num = num / 8;
			resultado = resto + resultado;
		}
		return resultado;
	}

	public static String calcularHexadecimal(int num) {
		if (num == 0) {
			return "0";
		}
		String resultado = "";
		int resto = 0;
		while (num > 0) {
			resto = num % 16;
			num = num / 16;
			if (resto < 10) {
				resultado = resto + resultado;
			} else {
				resultado = obtenerSimboloHexadecimal(resto) + resultado;
			}
		}
		return resultado;
	}

	public static char obtenerSimboloHexadecimal(int num) {
		if (num >= 10 && num <= 15) {
			switch (num) {
			case 10:
				return 'A';
			case 11:
				return 'B';
			case 12:
				return 'C';
			case 13:
				return 'D';
			case 14:
				return 'E';
			case 15:
				return 'F';
			}
		}
		return '-';

	}

}
