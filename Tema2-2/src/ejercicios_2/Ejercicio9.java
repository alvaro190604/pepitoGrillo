package ejercicios_2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Introduce un número mayor que 1 ");
            numero = teclado.nextInt();
        } while (numero <= 1);
        
        boolean esPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo == true) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
    }
}
