package com.brproj.bootcamp.projetospringreact.projetoSpringReact.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId
	private ScorePk idScore = new ScorePk();
	
	private Double value;
	
	public Score() {
		
	}
	
	public void setMovie(Movie movie) {
		idScore.setIdMovie(movie);
	}
	
	public void setUser(User user) {
		idScore.setIdUser(user);
	}

	public ScorePk getIdScore() {
		return idScore;
	}

	public void setIdScore(ScorePk idScore) {
		this.idScore = idScore;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
		
}
