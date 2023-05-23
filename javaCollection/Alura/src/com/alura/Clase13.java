package com.alura;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Clase13 {
	// TODO:
	// https://docs.oracle.com/javase/totorial/collections/interfaces/index.html
	// TODO:
	// https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html

	public static void main(String[] args) {

		String alumno1 = "Luis";
		String alumno2 = "Pepito";
		String alumno3 = "Juan";
		String alumno4 = "Pedro";
		String alumno5 = "Gustavo";
		String alumno6 = "Marcia";
		String alumno7 = "Gustavo";
		String alumno8 = "Marcia";

		Collection<String> listaAlumnos = new HashSet<>();

		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);

		// Ver si existe o no el alumno.
		boolean valida = listaAlumnos.contains("Pedro");
		System.out.println(valida);
		// Que elemento es mas grande.
		String max = listaAlumnos.stream().max(Comparator.comparing(String::length)).get();
		System.out.println(max);
		System.out.println(max.length());

		listaAlumnos.removeIf(alumno -> "Gustav".equalsIgnoreCase(alumno));

		listaAlumnos.forEach(alumno -> {
			System.out.println(alumno);
		});
	}
}
