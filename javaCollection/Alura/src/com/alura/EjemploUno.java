package com.alura;

import java.util.ArrayList;

public class EjemploUno {
	public static void main(String[] args) {
		String variable1 = "Ejemplo1";
		String variable2 = "Ejemplo2";
		String variable3 = "Ejemplo3";
		String variable4 = "Ejemplo4";

		ArrayList<String> lista = new ArrayList<>();
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);

		System.out.println(lista);

		// Metodo para retornar el tamaño de la lista
		System.out.println("Tamaño de lista: " + lista.size());

		// Remover array
		lista.remove(2);
		System.out.println(lista);

		// Modificar
		lista.set(1, "Ejemplo alterado");
		System.out.println(lista);
	}
}
