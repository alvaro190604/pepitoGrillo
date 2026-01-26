package Ejercicios;

import java.util.Date;
import java.util.Scanner;

public class Alumno {

	private String nombre;
	private String apellido;
	private Date fecha;
	private float notaP, si, ed, bbdd, ingles, ia, lm, ipe;
	private String dni;

	public Alumno(String nombre, String apellido, Date fecha) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha = fecha;
		this.dni = generarDniAleatorio();

		notaP = 5;
		si = 5;
		ed = 5;
		bbdd = 5;
		ingles = 5;
		ia = 5;
		lm = 5;
		ipe = 5;

	}

	public String generarDniAleatorio() {
		int numero = (int) (Math.random() * 99999999) + 1;
		// String numeroFormateado = String.format("%08d",numero);
		String numeroFormateado = String.valueOf(numero);
		while (numeroFormateado.length() < 8) {
			numeroFormateado = "0" + numeroFormateado;
		}
		int resto = numero % 23;
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = letras.charAt(resto);
		String numDni = Integer.toString(numero);
		return numDni + letra;
	}

	public String mostrarFecha(char separador) {
		if (separador == '/' || separador == '-') {
			return fecha.getDate() + "" + separador + (fecha.getMonth() + 1) + "" + separador
					+ (fecha.getYear() + 1900);
		}

		return "No es un separador valido";
	}

	public int contarLetrasNombre() {
		return nombre.length();
	}

	public boolean ordenarAlumnos(String apellidoAlumno) {
		if (apellido.toLowerCase().compareTo(apellidoAlumno.toLowerCase()) > 0) {
			return false;
		}
		return true;
	}

	public void recogerNotas(Scanner teclado) {
		System.out.println("Dime la nota de programación");
		notaP = teclado.nextFloat();
		System.out.println("Dime la nota de sistemas informáticos");
		si = teclado.nextFloat();
		System.out.println("Dime la nota de entornos de desarrollo");
		ed = teclado.nextFloat();
		System.out.println("Dime la nota de bases de datos");
		bbdd = teclado.nextFloat();
		System.out.println("Dime la nota de inglés");
		ingles = teclado.nextFloat();
		System.out.println("Dime la nota de introducción a la ia");
		ia = teclado.nextFloat();
		System.out.println("Dime la nota de lenguaje de marcas");
		lm = teclado.nextFloat();
		System.out.println("Dime la nota de IPE");
		ipe = teclado.nextFloat();
	}

	public boolean alumnoPasaCurso() {
		int horasProgramacion = 272;
		int horasSi = 170;
		int horasEd = 68;
		int horasBbdd = 170;
		int horasIngles = 68;
		int horasIa = 34;
		int horasLm = 102;
		int horasIpe = 102;

		int horasAprobadas = 0;

		if (notaP >= 5) {
			horasAprobadas = horasAprobadas + horasProgramacion;
		}
		if (si >= 5) {
			horasAprobadas = horasAprobadas + horasSi;
		}
		if (ed >= 5) {
			horasAprobadas = horasAprobadas + horasEd;
		}
		if (bbdd >= 5) {
			horasAprobadas = horasAprobadas + horasBbdd;
		}
		if (ingles >= 5) {
			horasAprobadas = horasAprobadas + horasIngles;
		}
		if (ia >= 5) {
			horasAprobadas = horasAprobadas + horasIa;
		}
		if (lm >= 5) {
			horasAprobadas = horasAprobadas + horasLm;
		}
		if (ipe >= 5) {
			horasAprobadas = horasAprobadas + horasIpe;
		}

		if (horasAprobadas >= 600) {
			return true;
		}
		return false;

	}

	public String calcularNotaMasAlta() {

		String asignaturaMasAlta = "Programación";
		float notaMasAlta = notaP;

		if (notaMasAlta < si) {
			notaMasAlta = si;
			asignaturaMasAlta = "Sistemas";
		}

		if (notaMasAlta < ed) {
			notaMasAlta = ed;
			asignaturaMasAlta = "Entornos";
		}

		if (notaMasAlta < bbdd) {
			notaMasAlta = bbdd;
			asignaturaMasAlta = "Bases de datos";
		}

		if (notaMasAlta < ingles) {
			notaMasAlta = ingles;
			asignaturaMasAlta = "Inglés";
		}

		if (notaMasAlta < ia) {
			notaMasAlta = ia;
			asignaturaMasAlta = "Introducción a la IA";
		}

		if (notaMasAlta < lm) {
			notaMasAlta = lm;
			asignaturaMasAlta = "Lenguaje de marcas";
		}

		if (notaMasAlta < ipe) {
			notaMasAlta = ipe;
			asignaturaMasAlta = "IPE";
		}

		return asignaturaMasAlta;

	}

	public String calcularNotaMasBaja() {

		String asignaturaMasBaja = "Programación";
		float notaMasBaja = notaP;

		if (notaMasBaja > si) {
			notaMasBaja = si;
			asignaturaMasBaja = "Sistemas";
		}

		if (notaMasBaja < ed) {
			notaMasBaja = ed;
			asignaturaMasBaja = "Entornos";
		}

		if (notaMasBaja < bbdd) {
			notaMasBaja = bbdd;
			asignaturaMasBaja = "Bases de datos";
		}

		if (notaMasBaja < ingles) {
			notaMasBaja = ingles;
			asignaturaMasBaja = "Inglés";
		}

		if (notaMasBaja < ia) {
			notaMasBaja = ia;
			asignaturaMasBaja = "Introducción a la IA";
		}

		if (notaMasBaja < lm) {
			notaMasBaja = lm;
			asignaturaMasBaja = "Lenguaje de marcas";
		}

		if (notaMasBaja < ipe) {
			notaMasBaja = ipe;
			asignaturaMasBaja = "IPE";
		}

		return asignaturaMasBaja;

	}

	public double calcularNotaMedia() {
		return (notaP + si + ed + bbdd + ingles + ia + lm + ipe) / 8;
	}

	public boolean compararAlumnos(Alumno alumno1) {
		if (calcularNotaMedia() > alumno1.calcularNotaMedia()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
	    return "Alumno [nombre " + nombre + " " + apellido + ", DNI: " + dni + "\n" +
	           "Nacido el " + fecha + "\n" +
	           "NOTAS:\n" +
	           "\t" + "Programación " + notaP + "\n" +
	           "\t" + "Sistemas informáticos "  + si + "\n" +
	           "\t" + "Entornos de desarrollo "  + ed + "\n" +
	           "\t" + "Bases de datos "  + bbdd + "\n" +
	           "\t" + "Inglés "  + ingles + "\n" +
	           "\t" + "Introducción a la IA "  + ia + "\n" +
	           "\t" + "Lenguaje de marcas "  + lm + "\n" +
	           "\t" + "IPE "  + ipe + "]";
	}

}
