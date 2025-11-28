package ejercicios_1;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String codigo;
		
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dime la abrebiación del país eligiendo entre estas: "
				+ "ES, US, UK, CA, FR, DE, BE, IT, SE, FI");
		codigo = teclado.next();
		teclado.close();
		
		String pais = switch (codigo) {
		case "ES" -> "España";
		case "US" -> "Estados Unidos";
		case "UK" -> "Reino Unido";
		case "CA" -> "Canadá";
		case "FR" -> "Francia";
		case "DE" -> "Alemania";
		case "BE" -> "Bélgica";
		case "IT" -> "Italia";
		case "SE" -> "Suecia";
		case "FI" -> "Finlandia";
		
		default -> "Error";
		};
		System.out.println(pais);
	}
}
