package com.alura.gerenciador.accion;

import java.io.IOException;

import com.alura.gerenciador.modelo.BD;
import com.alura.gerenciador.modelo.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MostrarEmpresa implements Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		System.out.println("Mostrando una empresa " + id);

		BD db = new BD();
		Empresa empresa = db.buscarEmpresaPorId(id);

		System.out.println(empresa.getNombre());
		request.setAttribute("empresa", empresa);

		return "forward:formModificarEmpresa.jsp";
	}
}
