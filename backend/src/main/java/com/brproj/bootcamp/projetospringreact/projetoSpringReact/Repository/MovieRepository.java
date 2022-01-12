package com.brproj.bootcamp.projetospringreact.projetoSpringReact.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brproj.bootcamp.projetospringreact.projetoSpringReact.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
