package com.alura.gerenciador.accion;

import java.io.IOException;

import com.alura.gerenciador.modelo.BD;
import com.alura.gerenciador.modelo.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login implements Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramLogin = request.getParameter("login");
		String paramPassword = request.getParameter("password");

		System.out.println("login " + paramLogin);

		BD db = new BD();
		Usuario usuario = db.existeUsuario(paramLogin, paramPassword);

		if (usuario != null) {
			System.out.println("Usuario existe");
			HttpSession sesion = request.getSession();
			sesion.setAttribute("loginUsuario", usuario);
			return "redirect:entrada?accion=ListaEmpresas";
		} else {
			return "redirect:entrada?accion=LoginForm";
		}
	}
}
