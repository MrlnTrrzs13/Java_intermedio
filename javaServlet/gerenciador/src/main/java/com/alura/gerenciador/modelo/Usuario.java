package com.alura.gerenciador.modelo;

public class Usuario {
	
	private String login, password;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean esIgual(String login, String password) {
		if(!this.login.equals(login)) {
			return false;
		}
		if(!this.password.equals(password)) {
			return false;
		}
		return true;
	}
}
