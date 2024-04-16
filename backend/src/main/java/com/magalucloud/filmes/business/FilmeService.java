package com.magalucloud.filmes.business;

import com.magalucloud.filmes.model.Filme;
import com.magalucloud.filmes.repository.FilmeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

  @Autowired
  private FilmeRepository repository;

  public List<Filme> findAll() {
    return repository.findAll();
  }

  public Filme findById(Long id) {
    return repository.findById(id).orElse(null);
  }

  public Filme save(Filme filme) {
    return repository.save(filme);
  }

  public void deleteById(Long id) {
    repository.deleteById(id);
  }
}