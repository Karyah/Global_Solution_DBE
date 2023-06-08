package com.fiap.Global.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.Global.UsuarioRepository;
import com.fiap.Global.entity.Usuario;

@RestController
@RequestMapping("/usuario/{id}")
public class UsuarioById {

	@Autowired
	public UsuarioRepository repository;
	
	@GetMapping
	public Usuario devolveUsuario(@PathVariable Long id){
		Usuario usuario = repository.getReferenceById(id);
		return usuario;
	}
}
