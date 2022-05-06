package com.educacao.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educacao.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
