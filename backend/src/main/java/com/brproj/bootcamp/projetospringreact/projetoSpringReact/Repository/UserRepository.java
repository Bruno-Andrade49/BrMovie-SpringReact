package com.brproj.bootcamp.projetospringreact.projetoSpringReact.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brproj.bootcamp.projetospringreact.projetoSpringReact.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
