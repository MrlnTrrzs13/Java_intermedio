package com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BD {

	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer llaveSecuencial = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(BD.llaveSecuencial++);
		empresa.setNombre("Alura");

		Empresa empresa2 = new Empresa();
		empresa2.setId(BD.llaveSecuencial++);
		empresa2.setNombre("Caelum");

		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);

		Usuario u1 = new Usuario();
		u1.setLogin("brandon");
		u1.setPassword("123456");
		Usuario u2 = new Usuario();
		u2.setLogin("bruno");
		u2.setPassword("123456");

		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
	}

	public void agregarEmpresa(Empresa empresa) {
		empresa.setId(BD.llaveSecuencial++);
		BD.listaEmpresas.add(empresa);
	}

	public static List<Empresa> getEmpresas() {
		return BD.listaEmpresas;
	}

	public void eliminarEmpresa(Integer id) {

		Iterator<Empresa> it = listaEmpresas.iterator();
		while (it.hasNext()) {
			Empresa empresa = it.next();
			if (empresa.getId() == id) {
				it.remove();
			}
		}

	}

	public Empresa buscarEmpresaPorId(Integer id) {

		for (Empresa empresa : listaEmpresas) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public Usuario existeUsuario(String paramLogin, String paramPassword) {
		for (Usuario usuario : listaUsuarios) {
			if (usuario.esIgual(paramLogin, paramPassword)) {
				return usuario;
			}
		}
		return null;
	}
}
