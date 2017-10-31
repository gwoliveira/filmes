package br.una.prova.repository;

import br.una.prova.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface FilmeRepository extends JpaRepository<Filme, Integer> {
}
