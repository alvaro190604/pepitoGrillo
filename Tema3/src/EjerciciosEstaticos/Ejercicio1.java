package EjerciciosEstaticos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Menú: ");
		System.out.println("Opcion 1: Sumar");
		System.out.println("Opcion 2: Restar");
		System.out.println("Opcion 3: Multiplicación");
		System.out.println("Opcion 4: División");
		System.out.println("Opcion 5: Factorial");
		System.out.println("Opcion 6: Primo");
		System.out.println("Opcion 7: Narcisista");

		int n1, n2;

		Scanner teclado = new Scanner(System.in);

		int opcion = teclado.nextInt();

		if (opcion > 0 && opcion <= 7) {

			switch (opcion) {
			case 1:
				System.out.println("Dime el primer número");
				n1 = teclado.nextInt();
				System.out.println("Dime el segundo número");
				n2 = teclado.nextInt();
				int resultadoSuma = sumar(n1, n2);
				System.out.println(resultadoSuma);
				break;
			case 2:
				System.out.println("Dime el primer número");
				n1 = teclado.nextInt();
				System.out.println("Dime el segundo número");
				n2 = teclado.nextInt();
				int resultadoResta = restar(n1, n2);
				System.out.println(resultadoResta);
				break;
			case 3:
				System.out.println("Dime el primer número");
				n1 = teclado.nextInt();
				System.out.println("Dime el segundo número");
				n2 = teclado.nextInt();
				int resultadoMultiplicacion = multiplicar(n1, n2);
				System.out.println(resultadoMultiplicacion);
				break;
			case 4:
				System.out.println("Dime el primer número");
				n1 = teclado.nextInt();
				System.out.println("Dime el segundo número");
				n2 = teclado.nextInt();
				int resultadoDivision = dividir(n1, n2);
				System.out.println(resultadoDivision);
				break;
			case 5:
				System.out.println("Dime el primer número");
				n1 = teclado.nextInt();
				int resultadoFactorial = factorial(n1);
				System.out.println(resultadoFactorial);
				break;
			case 6:
				System.out.println("Dime el primer número");
				n1 = teclado.nextInt();
				boolean resultadoPrimo = primo(n1);
				System.out.println(resultadoPrimo);
				break;
			case 7:
				System.out.println("Dime el primer número");
				n1 = teclado.nextInt();
				boolean resultadoNarcisista = narcisista(n1);
				System.out.println(resultadoNarcisista);
				break;
			default:
				System.out.println("La opción no existe");
				break;
			}
		}
	}

	public static int sumar(int n1, int n2) {

		int suma = n1 + n2;
		return suma;

	}

	public static int restar(int n1, int n2) {

		int resta = n1 - n2;
		return resta;
	}

	public static int multiplicar(int n1, int n2) {

		int multiplicacion = n1 * n2;
		return multiplicacion;
	}

	public static int dividir(int n1, int n2) {

		int division = n1 / n2;
		if (n2 == 0) {
			return -1;
		}
		return division;
	}

	public static int factorial(int n1) {
		int resultado = 1;
		for (int i = 1; i <= n1; i++) {
			resultado = resultado * i;
		}
		if (n1 < 0) {
			return -1;
		}
		if (n1 == 0) {
			return -2;
		}
		return resultado;
	}

	public static boolean primo(int n1) {
		if (n1 == 2) {
			return true;
		}
		boolean esPrimo = false;
		for (int i = 2; i < n1; i++) {
			if (n1 % i == 0) {
				esPrimo = false;
			} else
				esPrimo = true;
		}
		return esPrimo;
		
	}

	public static boolean narcisista(int n1) {
		int narcisista = 0;
		int aux = n1;
		int digitos = calcularDigitos(n1);
		while (n1 > 0) {
			int divisor = n1 % 10;
			narcisista = (int) (narcisista + Math.pow(divisor, digitos));
			n1 = n1 / 10;
		}
		if (narcisista == aux)
			return true;
		else
			return false;
	}

	public static int calcularDigitos(int n1) {
		int digitos = 0;
		while (n1 > 0) {
			n1 = n1 / 10;
			digitos++;
		}
		return digitos;
	}
}
