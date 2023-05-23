package com.alura;

import model.Alumno;
import model.Curso;

public class Clase15 {
	// TODO:
	// https://docs.oracle.com/javase/totorial/collections/interfaces/index.html
	// TODO:
	// https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html

	public static void main(String[] args) {

		Curso curso1 = new Curso("historia", 30);

		Alumno alumno1 = new Alumno("Luis", "001");
		Alumno alumno2 = new Alumno("Pepito", "002");
		Alumno alumno3 = new Alumno("Juan", "003");
		Alumno alumno4 = new Alumno("Pedro", "004");
		Alumno alumno5 = new Alumno("Gustavo", "005");
		Alumno alumno6 = new Alumno("Marcia", "006");
		Alumno alumno7 = new Alumno("Claudia", "007");
		Alumno alumno8 = new Alumno("Marcia", "008");

		curso1.addAlumno(alumno1);
		curso1.addAlumno(alumno2);
		curso1.addAlumno(alumno3);
		curso1.addAlumno(alumno4);
		curso1.addAlumno(alumno5);
		curso1.addAlumno(alumno6);
		curso1.addAlumno(alumno7);
		curso1.addAlumno(alumno8);

		Alumno alumnoNuevo = new Alumno("luis", "001");

		System.out.println(alumno1.equals(alumnoNuevo));
		System.out.println(curso1.getAlumno() .contains(alumnoNuevo));
	}
}
