package br.com.prog3.aula12_1.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prog3.aula12_1.domain.Curso;
import br.com.prog3.aula12_1.service.CursoService;



@RestController
@RequestMapping("/api/v1/cursos")
public class CursoResource {

	@GetMapping()
	public List<Curso> get(){
		CursoService cursoService = new CursoService();
		return cursoService.findAll();
	}

}
