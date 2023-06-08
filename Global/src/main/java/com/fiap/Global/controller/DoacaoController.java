package com.fiap.Global.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.Global.DoacaoRepository;
import com.fiap.Global.dto.DadosListagemDoacao;

@RestController
@RequestMapping("/doacao")
public class DoacaoController {

	@Autowired
	public DoacaoRepository repository;
	
	@GetMapping
	public Page<DadosListagemDoacao> listar(@PageableDefault Pageable paginacao){
		return repository.findAll(paginacao).map(DadosListagemDoacao::new);
	}
}
