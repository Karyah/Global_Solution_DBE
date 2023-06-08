package com.fiap.Global.dto;

import java.math.BigDecimal;

import com.fiap.Global.entity.Usuario;

public record DadosListagemUsuario(
		String nomeUsuario, 
		String emailUsuario, 
		String senhaUsuario, 
		BigDecimal cpfUsuario, 
		BigDecimal telefoneUsuario) {
	public DadosListagemUsuario(Usuario usuario) {
		this(usuario.getNomeUsuario(), usuario.getEmailUsuario(), usuario.getSenhaUsuario(),
				usuario.getCpfUsuario(), usuario.getTelefoneUsuario());
	}
}
