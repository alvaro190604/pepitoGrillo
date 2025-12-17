package Ejercicios;
import java.util.Date;

public class MainAlumnoEj15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date fecha = new Date(105,9,21);
		Alumno nuevo = new Alumno("Diego", "Mories",fecha);
		System.out.println(nuevo.mostrarFecha('/'));
	}

}
