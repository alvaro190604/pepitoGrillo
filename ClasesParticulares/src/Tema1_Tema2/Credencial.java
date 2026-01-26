package Tema1_Tema2;

public class Credencial {
	private static final int MAX_INTENTOS = 3;
	private static final int MIN_LONG_PASSWORD = 8;
	private String usuario;
	private String contraseña;
	private int intentosFallidos;
	private boolean bloqueado;
	
	public Credencial(String usuario, String contraseña) {
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.intentosFallidos = 0;
		this.bloqueado = false;
	}
	
	public String comprobarUsuario (String usuario) {
		if (usuario.equals(usuario)) {
			return "Son iguales";
		}
		return "No son iguales";
	}
	
	public String comprobarContraseña (String contraseña) {
		if (contraseña.length() == MIN_LONG_PASSWORD) {
			boolean mayus = false;
			boolean num = false;
			for (int i = 0; i < contraseña.length(); i++) {
				char caracter = contraseña.charAt(i);
				if (Character.isUpperCase(caracter)) {
					mayus = true;
				}
				if (Character.isDigit(caracter)) {
					num = true;
				}
			}
			if (mayus == true && num == true) {
				return "La contraseña es correcta";
			}
			return "La contraseña es incorrecta";
		}
		return "La contraseña es incorrecta";
	}
	
	public String login (String usuario, String contraseña) {
		if (comprobarUsuario(usuario).equals("Son iguales") && comprobarContraseña(contraseña).equals("La contraseña es correcta") && contraseña.equals(contraseña)) {
			intentosFallidos = 0;
			return "Login correcto";
		}
		intentosFallidos++;
		if (intentosFallidos >= MAX_INTENTOS) {
			bloqueado = true;
		}
		return "Login incorrecto";
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
	
}
