package com.fiap.Global.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.fiap.Global.UsuarioRepository;
import com.fiap.Global.dto.DadosLoginUsuario;
import com.fiap.Global.entity.Usuario;

@RestController
@RequestMapping("/login")
public class UsuarioLogin {

		@Autowired
		public UsuarioRepository repository;
		
		@PostMapping
	    @Transactional
	    public boolean logar(DadosLoginUsuario dados) {
	        Usuario usuario = repository.findReferenceByEmailUsuario(dados.emailUsuario());
	        boolean isTrue = usuario.logar(dados);
	        return isTrue;
	    }
	}


