package com.fiap.Global.dto;

import java.math.BigDecimal;

import com.fiap.Global.entity.Doacao;
import com.fiap.Global.entity.EnumFormaPagamento;
import com.fiap.Global.entity.Organizacao;
import com.fiap.Global.entity.Usuario;

public record DadosListagemDoacao(
		EnumFormaPagamento formaPagamento, 
		BigDecimal preco, 
		Usuario usuarioIdUsuario, 
		Organizacao organizacaoIdOrganizacao) {
	public DadosListagemDoacao(Doacao doacao) {
		this(doacao.getFormaPagamento(), doacao.getPreco(),
				doacao.getDoador(), doacao.getOrganizacao());
	}
}
