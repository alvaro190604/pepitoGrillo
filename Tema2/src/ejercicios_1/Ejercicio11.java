package ejercicios_1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int horas, minutos, segundos, segundosPedidos;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el número de segundos que quieres calcular");
		segundosPedidos = teclado.nextInt();
		teclado.close();
		
		horas = (segundosPedidos /3600);
		segundosPedidos = (segundosPedidos %3600);
		
		minutos = (segundosPedidos / 60);
		segundosPedidos = (segundosPedidos %60);
		
		segundos = (segundosPedidos);
		
		System.out.println("Serían " + horas + " horas, " + minutos
				+ " minutos y " + segundos + " segundos.");
	}

}
