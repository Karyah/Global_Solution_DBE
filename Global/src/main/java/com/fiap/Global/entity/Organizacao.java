package com.fiap.Global.entity;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fiap.Global.dto.DadosCadastroOrganizacao;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Organizacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrganizacao;
	private String nomeOrganizacao;
	private BigDecimal cnpjOrganizacao;
	private BigDecimal telefoneOrganizacao;
	private String emailOrganizacao;
	private String senhaOrganizacao;
	private String descricaoOrganizacao;
	private boolean ativoOrganizacao;
	
	public Organizacao() {

	}

	public Organizacao(DadosCadastroOrganizacao dados) {
		this.ativoOrganizacao = true;
		this.nomeOrganizacao = dados.nomeOrganizacao();
		this.cnpjOrganizacao = dados.cnpjOrganizacao();
		this.telefoneOrganizacao = dados.telefoneOrganizacao();
		this.emailOrganizacao = dados.emailOrganizacao();
		this.senhaOrganizacao = dados.senhaOrganizacao();
		this.descricaoOrganizacao = dados.descricaoOrganizacao();
	}


	public String getnomeOrganizacao() {
		return nomeOrganizacao;
	}

	public void setnomeOrganizacao(String nomeOrganizacao) {
		this.nomeOrganizacao = nomeOrganizacao;
	}

	public BigDecimal getcnpjOrganizacao() {
		return cnpjOrganizacao;
	}

	public void setcnpjOrganizacao(BigDecimal cnpjOrganizacao) {
		this.cnpjOrganizacao = cnpjOrganizacao;
	}

	public BigDecimal gettelefoneOrganizacao() {
		return telefoneOrganizacao;
	}

	public void settelefoneOrganizacao(BigDecimal telefoneOrganizacao) {
		this.telefoneOrganizacao = telefoneOrganizacao;
	}

	public String getemailOrganizacao() {
		return emailOrganizacao;
	}

	public void setemailOrganizacao(String emailOrganizacao) {
		this.emailOrganizacao = emailOrganizacao;
	}

	public String getsenhaOrganizacao() {
		return senhaOrganizacao;
	}

	public void setsenhaOrganizacao(String senhaOrganizacao) {
		this.senhaOrganizacao = senhaOrganizacao;
	}

	public String getDescricao() {
		return descricaoOrganizacao;
	}

	public void setDescricao(String descricao) {
		this.descricaoOrganizacao = descricao;
	}

	public boolean isAtivoOrganizacao() {
		return ativoOrganizacao;
	}

	public void setAtivoOrganizacao(boolean ativoOrganizacao) {
		this.ativoOrganizacao = ativoOrganizacao;
	}
	
	

}
