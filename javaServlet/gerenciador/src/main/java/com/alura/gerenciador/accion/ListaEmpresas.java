package com.alura.gerenciador.accion;

import java.io.IOException;
import java.util.List;

import com.alura.gerenciador.modelo.BD;
import com.alura.gerenciador.modelo.Empresa;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListaEmpresas implements Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		System.out.println("Llamando Empresas.");

		BD baseDeDatos = new BD();
		List<Empresa> listaEmpresas = baseDeDatos.getEmpresas();

		request.setAttribute("empresas", listaEmpresas);

		return "forward:listaEmpresas.jsp";
	}
}
