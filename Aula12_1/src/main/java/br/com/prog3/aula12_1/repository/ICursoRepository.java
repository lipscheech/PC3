package br.com.prog3.aula12_1.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.prog3.aula12_1.domain.Curso;
import br.com.prog3.aula12_1.enums.Modalidade;

@Repository
public interface ICursoRepository {

	List<Curso> findAll();

	Curso findById(Long id);

	List<Curso> findByModalidade(Modalidade modalidade);

	Curso inserir(Curso curso);

	Curso alterar(Curso curso);

	void excluir(Long id);

}
