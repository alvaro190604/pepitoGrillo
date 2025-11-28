package ejercicios_2;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n1 = 0, n2 = 1, resultado = 1, contador = 0;
		
		do {
			
			contador++;
			resultado = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + resultado);
			n1 = n2;
			n2 = resultado;
			
			
			
		} while (contador <= 50);
				
	}

}
