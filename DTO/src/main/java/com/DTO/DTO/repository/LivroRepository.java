package com.DTO.DTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public record Livro(Long id, String titulo, String autor) {
		
	}
	public interface LivroRepository extends JpaRepository<Livro, Long>{
		
	}


