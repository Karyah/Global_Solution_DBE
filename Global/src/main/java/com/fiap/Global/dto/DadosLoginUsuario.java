package com.fiap.Global.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosLoginUsuario(
		@NotBlank
		String emailUsuario,
		@NotBlank
		String senha
		) {
}
