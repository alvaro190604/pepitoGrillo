package Tema1_Tema2;

public class Libro {
	
	String titulo;
	String autor;
	boolean prestado;
	
	public Libro() {
		this.titulo = "Romeo y Julieta";
		this.autor = "Cervantes";
		this.prestado = true;
	}

	public Libro(String titulo, String autor, boolean prestado) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.prestado = prestado;
	}
	
	private void prestarLibro () {
		
		if (prestado = false) {
			prestado = true;
		}
		
	}
	
	private void devolverLibro () {
		
		prestado = false;
		
	}
	
	private void estadoLibro () {
		
		if (prestado = true) {
			System.out.println("El libro está prestado");
		}
		else {
			System.out.println("El libro está disponible");
		}
		
	}
	
}
