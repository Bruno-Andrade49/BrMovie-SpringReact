package com.brproj.bootcamp.projetospringreact.projetoSpringReact.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brproj.bootcamp.projetospringreact.projetoSpringReact.dto.MovieDto;
import com.brproj.bootcamp.projetospringreact.projetoSpringReact.dto.ScoreDTO;
import com.brproj.bootcamp.projetospringreact.projetoSpringReact.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

	@Autowired
	private ScoreService scoreService;
	
	@PutMapping
	public MovieDto saveScore(@RequestBody ScoreDTO dto) {
		MovieDto movieDto = scoreService.saveScore(dto);
		return movieDto;
	}

}
