package com.fiap.Global.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(@NotNull
		Long idUsuario,
		String nomeUsuario,
		BigDecimal cpfUsuario,
		BigDecimal telefoneUsuario,
		String emailUsuario,
		String senhaUsuario) {

}
