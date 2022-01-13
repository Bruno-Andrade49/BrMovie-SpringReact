package com.brproj.bootcamp.projetospringreact.projetoSpringReact.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brproj.bootcamp.projetospringreact.projetoSpringReact.entities.Score;
import com.brproj.bootcamp.projetospringreact.projetoSpringReact.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {
	
	

}
