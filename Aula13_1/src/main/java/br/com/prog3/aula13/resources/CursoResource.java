package br.com.prog3.aula13.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prog3.aula13.domain.Curso;
import br.com.prog3.aula13.service.CursoService;

@RestController
@RequestMapping("/api/v1/cursos")
public class CursoResource {
	
	@Autowired
	private CursoService cursoService;
	
	@PostMapping
	public Curso save(@RequestBody Curso curso) {
		return cursoService.save(curso);
	}
}
