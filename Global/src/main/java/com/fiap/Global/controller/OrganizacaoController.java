package com.fiap.Global.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.Global.OrganizacaoRepository;
import com.fiap.Global.dto.DadosListagemOrganizacao;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/organizacoes")
public class OrganizacaoController {

	@Autowired
	public OrganizacaoRepository repository;
	
	@GetMapping
	public Page<DadosListagemOrganizacao> listar(@PageableDefault Pageable paginacao) {
		return repository.findAllByAtivoOrganizacaoTrue(paginacao).map(DadosListagemOrganizacao::new);
	}
}
