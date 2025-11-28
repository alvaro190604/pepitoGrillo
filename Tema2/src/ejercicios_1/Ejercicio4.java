package ejercicios_1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usuario;
		String contraseña;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime el usuario");
		usuario = teclado.nextLine();
		
		System.out.println("Dime la contraseña");
		contraseña = teclado.nextLine();
		teclado.close();
		
		if (usuario.equals("alumno") && contraseña.equals("1234")) {
			System.out.println("El usuario existe y la contraseña es correcta");
		} else {
			System.out.println("El usuario no existe o la contraseña es erronea");
		}
		
		
	}

}
