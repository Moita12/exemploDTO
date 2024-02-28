package com.DTO.DTO.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.DTO.DTO.entities.Livro;
import com.DTO.DTO.service.Service;

public class LivroController {
	private final Service livroService;
	
	@Autowired
	public LivroController (Service livroService) {
		this.livroService = livroService;
	}
	@PostMapping
	public ResponseEntity<Livro> criar(@RequestBody @Valid Livro livro){
		Livro salvarLivro = livroService.salvar(livro);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvarLivro);
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<Livro> alteraClienteControl(@PathVariable Long id, @RequestBody @Valid Livro livro){
		Livro alteraLivro = livroService.atualizar(id, livro);
		if (alteraLivro != null) {
			return ResponseEntity.ok(alteraLivro);
		}
	}
}
