package com.DTO.DTO.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.DTO.DTO.entities.Livro;
import com.DTO.DTO.repository.LivroRepository;

public class Service {
	private final LivroRepository livroRepository;
	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	public Livro salvar(Livro livro) {
		Livro salvarLivro = livroRepository.save(livro);
		return new Livro(salvarLivro.getId(), salvarLivro.GetTitulo(), salvarLivro.getAutor());
}
	public Livro atualizar(Long id, Livro livro) {
		Livro existeLivro.setTitulo(livro.getTitulo());
		Livro existeLivro.setAutor(livro.getAutor());
		Livro updateLivro = livroRepository.save(existeLivro);
		return new Livro(updateLivro.getId(), updateLivro.getTitulo(), updatedLivro.getAutor());
		
	}
	public boolean deletar(Long id) {
		Optional<Livro> existeCliente = livroRepository.findById(id);
		if (existeCliente.isPresent()) {
			livroRepository.deleteById(id);
			return true;
		}
		
	}
}
