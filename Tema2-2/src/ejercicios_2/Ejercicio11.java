package ejercicios_2;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
        int numero = 1;

        System.out.println("Los 15 primeros números primos son:");

        while (contador < 15) {
            boolean esPrimo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                System.out.print(numero + " ");
                contador++;
            }

            numero++;
        }
    }
}
