package Tema1_Tema2;

public class Puerta {
	
	private boolean abierta;

	public Puerta(boolean abierta) {
		this.abierta = false;
	}
	
	public void abrir (boolean alarmaActivada) {
		if (!alarmaActivada) {
			this.abierta = true;
		}
		else {
			System.out.println("La puerta no se puede abrir");
		}
	}
	
	public void cerrar () {
		this.abierta = false;
	}
	
	public String estado () {
		return 
	}
	
}
