package ejercicios;
import java.util.Scanner;
public class EjercicioClase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int edad;
		boolean esMayor;
		float estatura;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la edad");
		edad = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Introduzca el nombre");
		nombre = sc.nextLine();
		
		System.out.println("Dime tu estatura");
		estatura = sc.nextFloat();
		
		System.out.println("Eres mayor de edad?");
		esMayor = sc.nextBoolean();
		sc.close();
		
		System.out.println("Edad: " + edad + " Nombre: " + nombre 
				+ " Estatura: " + estatura + " Es mayor de edad?: " + esMayor);
	}

}
