package com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import model.Alumno;

public class Clase14 {
	// TODO:
	// https://docs.oracle.com/javase/totorial/collections/interfaces/index.html
	// TODO:
	// https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html

	public static void main(String[] args) {

		Alumno alumno1 = new Alumno("Luis", "001");
		Alumno alumno2 = new Alumno("Pepito", "002");
		Alumno alumno3 = new Alumno("Juan", "003");
		Alumno alumno4 = new Alumno("Pedro", "004");
		Alumno alumno5 = new Alumno("Gustavo", "005");
		Alumno alumno6 = new Alumno("Marcia", "006");
		Alumno alumno7 = new Alumno("Claudia", "007");
		Alumno alumno8 = new Alumno("Marcia", "008");

		Collection<Alumno> listaAlumnos = new HashSet<>();
		Collection<Alumno> listaAlumnos1 = new ArrayList<>();

		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);

		System.out.println(listaAlumnos.contains(alumno1));
		System.out.println(listaAlumnos1.contains(alumno1));

		Alumno alumnoNuevo = new Alumno("luis", "001");
		System.out.println(listaAlumnos.contains(alumnoNuevo));
		System.out.println(listaAlumnos1.contains(alumnoNuevo));
		
		System.out.println(alumno1.equals(alumnoNuevo));
	}
}
