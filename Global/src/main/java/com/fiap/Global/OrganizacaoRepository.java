package com.fiap.Global;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.Global.entity.Organizacao;

public interface OrganizacaoRepository extends JpaRepository<Organizacao, Long>{
	Page<Organizacao> findAllByAtivoOrganizacaoTrue(Pageable paginacao);
}
