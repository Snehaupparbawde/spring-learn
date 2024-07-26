package org.dnyanyog.dao;

import org.dnyanyog.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
