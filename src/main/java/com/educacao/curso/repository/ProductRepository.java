package com.educacao.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educacao.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
