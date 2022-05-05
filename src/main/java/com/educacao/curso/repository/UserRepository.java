package com.educacao.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educacao.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
