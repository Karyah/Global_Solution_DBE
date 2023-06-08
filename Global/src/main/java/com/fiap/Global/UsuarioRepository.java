package com.fiap.Global;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.Global.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Page <Usuario> findAllByAtivoUsuarioTrue(Pageable paginacao);

	Usuario findReferenceByEmailUsuario(String emailUsuario);
}
	
