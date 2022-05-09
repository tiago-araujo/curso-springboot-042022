package com.educacao.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educacao.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{

}
