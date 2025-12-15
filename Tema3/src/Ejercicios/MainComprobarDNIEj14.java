package Ejercicios;

import java.util.Scanner;

public class MainComprobarDNIEj14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion;

		Usuario cuenta = new Usuario("Marcos", "89262718A", "Salamanca", 2000);

		do {
			System.out.println("----MENÚ----");
			System.out.println("0) Salir");
			System.out.println("1) Ver info cuenta");
			System.out.println("2) Ver saldo");
			System.out.println("3) Ingresar");
			System.out.println("4) Sacar dinero");
			System.out.println("5) Modificar domicilio");

			System.out.println("Introduzca la opción deseada: ");
			opcion = teclado.nextInt();
			teclado.nextLine();

			switch (opcion) {
			case 0:
				System.out.println("Hasta otra!!");
				break;
			case 1:
				System.out.println(cuenta);
				break;
			case 2:
				System.out.println("Saldo de la cuenta: " + cuenta.getDinero() + " €");
				break;
			case 3:
				int dineroIngresar;
				do {
					System.out.println("¿Cuánto quiere ingresar?");
					dineroIngresar = teclado.nextInt();
					teclado.nextLine();
				} while (dineroIngresar <= 0);

				cuenta.ingresarDinero(dineroIngresar);

				break;
			case 4:
				int dineroSacar;
				do {
					System.out.println("¿Cuánto quiere sacar?");
					dineroSacar = teclado.nextInt();
					teclado.nextLine();
				} while (dineroSacar <= 0);
				cuenta.sacarDinero(dineroSacar);
				break;
			case 5:

				System.out.println("Introduzca su nueva dirección");
				String direccionNueva = teclado.nextLine();
				cuenta.setDomicilio(direccionNueva);
				break;

			default:
				System.out.println("Opción no reconocida");
				break;
			}

		} while (opcion != 0);
		teclado.close();
	}

}
