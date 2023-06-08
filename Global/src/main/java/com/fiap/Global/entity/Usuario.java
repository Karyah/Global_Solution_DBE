package com.fiap.Global.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fiap.Global.dto.DadosCadastroUsuario;
import com.fiap.Global.dto.DadosLoginUsuario;
import com.fiap.Global.dto.DadosAtualizacaoUsuario;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Usuario")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	private String nomeUsuario;
	private String emailUsuario;
	private BigDecimal cpfUsuario;
	private BigDecimal telefoneUsuario;
	private String senhaUsuario;
	private boolean ativoUsuario;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(DadosCadastroUsuario dados) {
		super();
		this.nomeUsuario = dados.nomeUsuario();
		this.emailUsuario = dados.emailUsuario();
		this.cpfUsuario = dados.cpfUsuario();
		this.telefoneUsuario = dados.telefoneUsuario();
		this.senhaUsuario = dados.senhaUsuario();
		this.ativoUsuario = true;
	}

	public void atualizarInformacoes(DadosAtualizacaoUsuario dados) {
		if (dados.nomeUsuario() != null) {
			this.nomeUsuario = dados.nomeUsuario();
		}
		if (dados.cpfUsuario() != null) {
			this.cpfUsuario = dados.cpfUsuario();
		}
		if (dados.telefoneUsuario() != null) {
			this.telefoneUsuario = dados.telefoneUsuario();
		}
		if (dados.emailUsuario() != null) {
			this.emailUsuario = dados.emailUsuario();
		}
		if (dados.senhaUsuario() != null) {
			this.senhaUsuario = dados.senhaUsuario();
		}
	}

	
	public boolean logar(DadosLoginUsuario dados) {
        if (dados.emailUsuario().equals(this.emailUsuario) && dados.senha().equals(this.senhaUsuario)){
            return true;
        }
        return false;
    }

	
	public void excluir() {
		this.ativoUsuario = false;
	}


	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public BigDecimal getCpfUsuario() {
		return cpfUsuario;
	}

	public void setCpfUsuario(BigDecimal cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

	public BigDecimal getTelefoneUsuario() {
		return telefoneUsuario;
	}

	public void setTelefoneUsuario(BigDecimal telefoneUsuario) {
		this.telefoneUsuario = telefoneUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public boolean getAtivoUsuario() {
		return ativoUsuario;
	}

	public void setAtivoUsuario(boolean ativoUsuario) {
		this.ativoUsuario = ativoUsuario;
	}
	
	
	
}
