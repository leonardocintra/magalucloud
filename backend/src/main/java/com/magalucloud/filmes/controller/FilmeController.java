package com.magalucloud.filmes.controller;

import com.magalucloud.filmes.business.FilmeService;
import com.magalucloud.filmes.model.Filme;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

  @Autowired
  private FilmeService service;

  @GetMapping
  public List<Filme> listAll() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  public Filme getById(@PathVariable Long id) {
    return service.findById(id);
  }

  @PostMapping
  public Filme create(@RequestBody Filme filme) {
    return service.save(filme);
  }

  @PutMapping("/{id}")
  public Filme update(@PathVariable Long id, @RequestBody Filme filme) {
    filme.setId(id);
    return service.save(filme);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    service.deleteById(id);
  }
}