package br.com.prog3.aula12_1.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.prog3.aula12_1.domain.Curso;
import br.com.prog3.aula12_1.enums.Modalidade;

@Repository
public class CursoRepository implements ICursoRepository{

	@Override
	public List<Curso> findAll() {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso(1L, "Java básico", 40, Modalidade.PRESENCIAL));
		cursos.add(new Curso(2L, "Java intermediário", 40, Modalidade.A_DISTANCIA));
		cursos.add(new Curso(3L, "Spring Boot", 40, Modalidade.PRESENCIAL));
		cursos.add(new Curso(4L, "VUEJS", 40, Modalidade.PRESENCIAL));
		
		return cursos;
		
	}

	@Override
	public Curso findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> findByModalidade(Modalidade modalidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curso inserir(Curso curso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curso alterar(Curso curso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}



}
