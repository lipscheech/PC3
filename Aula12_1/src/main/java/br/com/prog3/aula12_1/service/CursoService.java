package br.com.prog3.aula12_1.service;

import java.util.List;

import br.com.prog3.aula12_1.domain.Curso;
import br.com.prog3.aula12_1.repository.CursoRepository;

public class CursoService {

	public List<Curso> findAll(){
		CursoRepository cursoRepository = new CursoRepository();
		return cursoRepository.findAll();
	}

}
