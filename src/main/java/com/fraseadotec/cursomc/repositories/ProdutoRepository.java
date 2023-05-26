package com.fraseadotec.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fraseadotec.cursomc.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
