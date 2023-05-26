package com.fraseadotec.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fraseadotec.cursomc.domain.Categoria;
import com.fraseadotec.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> buscar(@PathVariable Integer id) {

		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
