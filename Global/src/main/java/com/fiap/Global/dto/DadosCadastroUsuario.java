package com.fiap.Global.dto;

import java.math.BigDecimal;

public record DadosCadastroUsuario(
		String nomeUsuario,
		String emailUsuario,
		String senhaUsuario,
		BigDecimal cpfUsuario,
		BigDecimal telefoneUsuario,
		Boolean ativoUsuario){

}
