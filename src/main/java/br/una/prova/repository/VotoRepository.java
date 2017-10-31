package br.una.prova.repository;

import br.una.prova.entity.Voto;
import org.springframework.data.repository.CrudRepository;

public interface VotoRepository extends CrudRepository<Voto, Integer> {
}
