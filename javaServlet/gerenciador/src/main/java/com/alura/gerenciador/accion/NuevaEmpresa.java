package com.alura.gerenciador.accion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.alura.gerenciador.modelo.BD;
import com.alura.gerenciador.modelo.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NuevaEmpresa implements Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Nueva Empresa Registrada.");

		String nombreEmpresa = request.getParameter("nombre");
		String paramFechaApertura = request.getParameter("fecha");

		Date fechaApertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
			fechaApertura = sdf.parse(paramFechaApertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		Empresa empresa = new Empresa();
		empresa.setNombre(nombreEmpresa);
		empresa.setFechaApertura(fechaApertura);

		BD baseDeSatos = new BD();
		baseDeSatos.agregarEmpresa(empresa);

		request.setAttribute("empresa", empresa.getNombre());

		return "redirect:entrada?accion=ListaEmpresas";
	}
}
