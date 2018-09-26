package br.com.entity;

import java.io.Serializable;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int usuario;
	private String senha;
	public int getUsuario() {
		return usuario;
	}
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
	public Sting getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
