package ejercicios_2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean esPrimo = false; 

        while (esPrimo == false) { 
            System.out.print("Introduce un número mayor que 1: ");
            numero = teclado.nextInt();

            if (numero <= 1) {
                System.out.println("El número tiene que ser mayor que 1.");
                esPrimo = false;
            } else {
                esPrimo = true;
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                    }
                }

                if (esPrimo == false) {
                    System.out.println(numero + " no es primo. Intenta de nuevo.");
                }
            }
        }

        System.out.println("El número " + numero + " es primo");
    }
}
