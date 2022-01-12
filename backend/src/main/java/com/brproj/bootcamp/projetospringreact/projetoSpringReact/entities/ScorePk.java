package com.brproj.bootcamp.projetospringreact.projetoSpringReact.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ScorePk implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie idMovie;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User idUser;

	public ScorePk() {

	}

	public Movie getIdMovie() {
		return idMovie;
	}

	public void setIdMovie(Movie idMovie) {
		this.idMovie = idMovie;
	}

	public User getIdUser() {
		return idUser;
	}

	public void setIdUser(User idUser) {
		this.idUser = idUser;
	}

}
