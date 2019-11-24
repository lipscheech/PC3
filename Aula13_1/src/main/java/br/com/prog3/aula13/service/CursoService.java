package br.com.prog3.aula13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.prog3.aula13.domain.Curso;
import br.com.prog3.aula13.repository.CursoRepository;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository cursoRepository;
	
	public Curso save(Curso curso) {
		return cursoRepository.save(curso);
	}
}
