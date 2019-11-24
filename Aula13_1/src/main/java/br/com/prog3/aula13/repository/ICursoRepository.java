package br.com.prog3.aula13.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.prog3.aula13.domain.Curso;


public interface ICursoRepository extends CrudRepository<Curso, Long>{

}
