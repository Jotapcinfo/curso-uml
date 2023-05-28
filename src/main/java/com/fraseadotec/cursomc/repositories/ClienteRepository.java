package com.fraseadotec.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fraseadotec.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
