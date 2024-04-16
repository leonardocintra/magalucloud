package com.magalucloud.filmes.model;


import com.magalucloud.filmes.enums.Genero;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "filme")
public class Filme {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String diretor;

  @Enumerated(EnumType.STRING)
  private Genero genero;
  private Boolean assistido;
}
