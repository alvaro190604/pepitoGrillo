package Tema1_Tema2;

import java.util.Scanner;

public class MainCredencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		Credencial credencial = new Credencial ("Álvaro", "Pacoes12");
		
		do {
			String usuarioIntroducido;
			String contraseñaIntroducida;
			System.out.println("Dime el usuario");
			usuarioIntroducido = teclado.nextLine();
			System.out.println("Dime la contraseña");
			contraseñaIntroducida = teclado.nextLine();
			
			if (credencial.login(usuarioIntroducido, contraseñaIntroducida).equals("Login correcto")) {
				System.out.println(credencial.login(usuarioIntroducido, contraseñaIntroducida));
				break;
			}
			
		} while (credencial.isBloqueado() == false);
		
		if (credencial.isBloqueado() == true) {
			System.out.println("LA CUENTA ESTÁ BLOQUEADA");
		}
	}

}
