package com.fiap.Global.dto;

import java.math.BigDecimal;

import com.fiap.Global.entity.EnumFormaPagamento;
import com.fiap.Global.entity.Organizacao;
import com.fiap.Global.entity.Usuario;

public record DadosCadastroDoacao(
		BigDecimal preco,
		EnumFormaPagamento formaPagamento,
		DadosCadastroUsuario usuarioIdUsuario,
		DadosCadastroOrganizacao organizacaoIdOrganizacao
		) {

}
