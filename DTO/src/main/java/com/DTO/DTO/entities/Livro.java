package com.DTO.DTO.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

@NotBlank
private String titulo;
@NotBlank
private String autor;

}
