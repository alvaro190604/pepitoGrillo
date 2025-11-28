package ejercicios;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime la cantidad");
		numero = teclado.nextInt();
		teclado.close();
		
		int bille500 = numero/500;
		numero = numero % 500;
		
		int bille200 = numero/200;
		numero = numero % 200;
		
		int bille100 = numero/100;
		numero = numero % 100;
		
		int bille50 = numero/50;
		numero = numero % 50;
		
		int bille20 = numero/20;
		numero = numero % 20;
		
		int bille10 = numero/10;
		numero = numero % 10;
		
		int bille5 = numero/5;
		numero = numero % 5;
		
		System.out.println("La cantidad de euros es: " + numero + "\n"
				+ bille500 + " billetes de 500€" + "\n"
				+ bille200 + " billetes de 200€" + "\n"
				+ bille100 + " billetes de 100€" + "\n"
				+ bille50 + " billetes de 50€" + "\n"
				+ bille20 + " billetes de 20€" + "\n"
				+ bille10 + " billetes de 10€" + "\n"
				+ bille5 + " billetes de 5€" + "\n");
		
	}

}
