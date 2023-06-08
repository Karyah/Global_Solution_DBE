package com.fiap.Global.dto;

import java.math.BigDecimal;

public record DadosCadastroOrganizacao(
		String nomeOrganizacao, 
		BigDecimal cnpjOrganizacao,
		BigDecimal telefoneOrganizacao,
		String emailOrganizacao,
		String senhaOrganizacao,
		String descricaoOrganizacao) {

}
