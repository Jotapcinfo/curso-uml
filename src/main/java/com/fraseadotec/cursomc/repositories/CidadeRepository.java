package com.fraseadotec.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fraseadotec.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
