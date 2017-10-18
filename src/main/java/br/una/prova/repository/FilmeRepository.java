package br.una.prova.repository;

import br.una.prova.entity.Filme;
import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends CrudRepository<Filme, Integer>{
}
