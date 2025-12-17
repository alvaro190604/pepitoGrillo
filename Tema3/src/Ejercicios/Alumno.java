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
		int resto = numero % 23;
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = letras.charAt(resto);
		String numDni = Integer.toString(numero);
		return numDni + letra;
	}

	public String mostrarFecha(char separador) {
		if (separador == '/' || separador == '-') {
			return fecha.getDate() + "" + separador + (fecha.getMonth() + 1) + "" + separador + (fecha.getYear() + 1900);
		}

		return "No es un separador valido";
	}
	
	public int contarLetrasNombre () {
		return nombre.length();
	}
	
	public boolean ordenarAlumnos (String apellidoAlumno) {
		if (apellido.toLowerCase().compareTo(apellidoAlumno.toLowerCase()) > 0) {
			return false;
		}
		return true;
	}
	public void recogerNotas (Scanner teclado) {
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

}
