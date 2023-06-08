package com.fiap.Global.dto;

import com.fiap.Global.entity.Organizacao;

public record DadosListagemOrganizacao(
		String nomeOrganizacao,
		String descricaoOrganizacao){
	public DadosListagemOrganizacao(Organizacao organizacao) {
		this(organizacao.getnomeOrganizacao(), organizacao.getDescricao());
	}

}
