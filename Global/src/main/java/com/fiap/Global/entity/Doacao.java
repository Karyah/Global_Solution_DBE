package com.fiap.Global.entity;

import java.math.BigDecimal;
import com.fiap.Global.dto.DadosCadastroDoacao;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name="Doacao")
public class Doacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDoacao;

	private BigDecimal preco;
	
	@Enumerated(EnumType.STRING)
	private EnumFormaPagamento formaPagamento;
	
	@ManyToOne
	private Usuario usuarioIdUsuario;

	@ManyToOne
	private Organizacao organizacaoIdOrganizacao;

//Construtores
	public Doacao() {

	}

	public Doacao(DadosCadastroDoacao dados) {
		this.preco = dados.preco();
		this.formaPagamento = dados.formaPagamento();
		this.usuarioIdUsuario = new Usuario(dados.usuarioIdUsuario());
		this.organizacaoIdOrganizacao = new Organizacao(dados.organizacaoIdOrganizacao());
	}

	public Long getId() {
		return idDoacao;
	}

	public void setId(Long id) {
		this.idDoacao = id;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public EnumFormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(EnumFormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Usuario getDoador() {
		return usuarioIdUsuario;
	}

	public void setDoador(Usuario doador) {
		this.usuarioIdUsuario = doador;
	}

	public Organizacao getOrganizacao() {
		return organizacaoIdOrganizacao;
	}

	public void setOrganizacao(Organizacao organizacao) {
		this.organizacaoIdOrganizacao = organizacao;
	}



}
