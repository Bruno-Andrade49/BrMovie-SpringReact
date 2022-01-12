package com.brproj.bootcamp.projetospringreact.projetoSpringReact.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brproj.bootcamp.projetospringreact.projetoSpringReact.Repository.MovieRepository;
import com.brproj.bootcamp.projetospringreact.projetoSpringReact.dto.MovieDto;
import com.brproj.bootcamp.projetospringreact.projetoSpringReact.entities.Movie;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;

	@Transactional(readOnly = true)
	public Page<MovieDto> findAll(Pageable pageable) {

		Page<Movie> lista = repository.findAll(pageable);
		Page<MovieDto> page = lista.map(x -> new MovieDto(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDto findById(Long id) {

		Movie result = repository.findById(id).get();
		MovieDto dto = new MovieDto(result);
		return dto;
		
	}

}
