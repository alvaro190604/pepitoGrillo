package Ejercicios;

public class ComprobarDNI {

	private String usuario;
	private String dni;
	private String domicilio;
	private int dinero;

	public void Usuario(String usuario, String dni, String domicilio, int dinero) {
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

	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", dni=" + dni + ", domicilio=" + domicilio + ", dinero=" + dinero + "]";
	}

}
