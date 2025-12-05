package Ejercicios;

import java.util.Scanner;

public class MainRectanguloEj8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion;
		int base;
		int altura;
		
		Rectangulo figura = new Rectangulo ();
		
		do {
			System.out.println("----MENÚ----");
			System.out.println("0) Salir");
			System.out.println("1) Ver base y altura");
			System.out.println("2) Ingresar valores y si no son positivos, por defecto");
			System.out.println("3) Decir área del rectángulo");
			System.out.println("4) Decir perímetro del rectángulo");
			System.out.println("5) Decir si es horizontal o vertical");
			System.out.println("6) Imprimir rectángulo");
			
			System.out.println("Introduzca la opción deseada: ");
			opcion = teclado.nextInt();
			teclado.nextLine();
			
			switch (opcion) {
			case 0:
				System.out.println("Has salido del programa");
				break;
			case 1:
				System.out.println(figura);
				break;
			case 2:
				System.out.println("Dime la base del rectángulo");
				base = teclado.nextInt();
				figura.setBase(base);
				System.out.println("Dime la altura del rectángulo");
				altura = teclado.nextInt();
				figura.setAltura(altura);
				break;
			case 3:
				System.out.println("El área del rectángulo es: " + figura.calcularArea());
				break;
			case 4:
				System.out.println("El perímetro del rectángulo es: " + figura.calcularPerimetro());
				break;
			case 5:
				System.out.println("El rectángulo es: " + figura.decirHoV());
				break;
			case 6:
				System.out.println("Este es el rectángulo: " + "\n");
				figura.imprimirRectangulo();
				break;
			default:
				System.out.println("Opción no reconocida");
				break;
			}

		} while (opcion != 0);
		teclado.close();
	}

}
