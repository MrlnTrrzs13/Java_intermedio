package com.alura;

import java.util.ArrayList;

public class Clase2 {
	public static void main(String[] args) {
		String variable1 = "Ejemplo1";
		String variable2 = "Ejemplo2";
		String variable3 = "Ejemplo3";
		String variable4 = "Ejemplo4";

		ArrayList<String> listaString = new ArrayList<>();
		listaString.add(variable1);
		listaString.add(variable2);
		listaString.add(variable3);
		listaString.add(variable4);

		System.out.println(listaString);

		System.out.println("For tradicional.");
		for (int i = 0; i < listaString.size(); i++) {
			System.out.println(listaString.get(i));
		}

		System.out.println("For tipo ForEach.");
		for (String clase : listaString) {
			System.out.println(clase);
		}

		System.out.println("ForEach recurso de lambda.");
		listaString.forEach(clase -> {
			System.out.println(clase);
		});
	}
}
