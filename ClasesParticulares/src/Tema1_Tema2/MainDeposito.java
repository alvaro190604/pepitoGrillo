package Tema1_Tema2;

import java.util.Scanner;

public class MainDeposito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		Deposito deposito1 = new Deposito ("Dep1", 5000, 2000, true);
		Deposito deposito2 = new Deposito ("Dep1", 7000, 1000, true);
		Deposito deposito3 = new Deposito ("Dep1", 8000, 4000, true);
		
		Deposito arrayDepositos [] = new Deposito[3];
		
		arrayDepositos [0] = deposito1;
		arrayDepositos [1] = deposito2;
		arrayDepositos [2] = deposito3;
		
		int opcion;
		
		 do {
	            System.out.println("Menu:");
	            System.out.println("0) Salir");
	            System.out.println("1) Elegir depósito y añadir agua");
	            System.out.println("2) Elegir depósito y extraer agua");
	            opcion = teclado.nextInt();

	            if (opcion == 1 || opcion == 2) {

	                System.out.print("Elige depósito: ");
	                int indice = teclado.nextInt();

	                if (indice < 0 || indice >= arrayDepositos.length) {
	                    System.out.println("Depósito no válido");
	                    continue;
	                }

	                System.out.print("Introduce litros: ");
	                int litros = teclado.nextInt();

	                if (opcion == 2) {
	                    litros = -litros;
	                }

	        } while (opcion != 0);

	        System.out.println("Programa finalizado.");
	        teclado.close();
		 }
	}

}
