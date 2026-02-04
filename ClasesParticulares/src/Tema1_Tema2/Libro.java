package Tema1_Tema2;

public class Libro {
	
	private String titulo;
	private String autor;
	private boolean prestado;
	
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
	
	public void prestarLibro () {
		
		if (prestado == false) {
			prestado = true;
		}
		
	}
	
	public void devolverLibro () {
		
		prestado = false;
		
	}
	
	public void estadoLibro () {
		
		if (prestado == true) {
			System.out.println("El libro está prestado");
		}
		else {
			System.out.println("El libro está disponible");
		}
		
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", prestado=" + prestado + "]";
	}
	
}
