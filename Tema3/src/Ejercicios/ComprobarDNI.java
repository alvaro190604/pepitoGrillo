package Ejercicios;

public class ComprobarDNI {

	private String usuario;
	private String dni;
	private String domicilio;
	private int dinero;

	public ComprobarDNI(String usuario, String dni, String domicilio, int dinero) {
		this.usuario = usuario;
		this.dni = dni;
		this.domicilio = domicilio;
		this.dinero = dinero;
	}

	public String decirDNI() {
		return (dni);
	}

	public String decirDomicilio() {
		return (domicilio);
	}

	public int decirDinero() {
		return (dinero);
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public String decirNombre() {
		return "Usuario [user=" + usuario + dni + domicilio + dinero + "]";
	}

	public void sacarDinero(int dineroSacar) {
		if (dineroSacar <= 0 || dinero <= 0) {
			System.out.println("Operación fallida");
		} else {
			dinero = dinero - dineroSacar;
			System.out.println("Operación realziada con éxito");
		}
	}

	public void ingresarDinero(int dineroIngresar) {
		if (dineroIngresar <= 0) {
			System.out.println("Error realizando la operación");
		} else {
			this.dinero = this.dinero + dineroIngresar;
			System.out.println("Operación realziada con éxito");
		}
	}

	public void setDomicilio(String direccionNueva) {
		this.domicilio = direccionNueva;
	}

	public boolean comprobarDNI1() {

		if (dni.length() != 9) {
			return false;
		}

		char l0 = dni.charAt(0);
		char l1 = dni.charAt(1);
		char l2 = dni.charAt(2);
		char l3 = dni.charAt(3);
		char l4 = dni.charAt(4);
		char l5 = dni.charAt(5);
		char l6 = dni.charAt(6);
		char l7 = dni.charAt(7);
		char l8 = dni.charAt(8);

		if (Character.isDigit(l0) && Character.isDigit(l1) && Character.isDigit(l2) && Character.isDigit(l3)
				&& Character.isDigit(l4) && Character.isDigit(l5) && Character.isDigit(l6) && Character.isDigit(l7)
				&& (Character.isLetter(l8))) {

			String numeros = l0 + "" + l1 + "" + l2 + "" + l3 + "" + l4 + "" + l5 + "" + l6 + "" + l7;

			int resultado = Integer.parseInt(numeros) % 23;

			String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

			char letraReal = letras.charAt(resultado);

			if (letraReal == l8) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}

	}

	public boolean comprobarDNI2() {
		if (dni.length() != 9) {
			return false;
		}

		char l8 = dni.charAt(8);
		String numeros = "";

		for (int i = 0; i < 8; i++) {
			char comprobar = dni.charAt(i);
			if (Character.isDigit(comprobar) == false) {
				return false;
			}
			numeros += comprobar;
		}
		if (Character.isLetter(l8) == false) {
			return false;
		}

		int resultadoEnNumero = Integer.parseInt(numeros);
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int resto = resultadoEnNumero % 23;
		char letraReal = letras.charAt(resto);

		if (letraReal == l8) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "ComprobarDNI [usuario=" + usuario + ", dni=" + dni + ", domicilio=" + domicilio + ", dinero=" + dinero
				+ "]";
	}

}
