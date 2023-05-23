package com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hola")

public class HolaMundoServlet extends HttpServlet {

	public HolaMundoServlet() {
		System.out.println("Creando Hola Mundo Servlet");
	}

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest rqs, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Hola mundo! Felicitaciones por tu primer Servlet!");
		out.println("/<body>");
		out.println("</html>");
	}
}
