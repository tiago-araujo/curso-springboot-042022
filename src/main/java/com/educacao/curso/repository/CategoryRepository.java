package com.educacao.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educacao.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
