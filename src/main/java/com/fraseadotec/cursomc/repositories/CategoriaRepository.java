package com.fraseadotec.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fraseadotec.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
