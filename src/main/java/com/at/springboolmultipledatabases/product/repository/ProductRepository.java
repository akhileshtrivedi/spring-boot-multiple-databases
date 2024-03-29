package com.at.springboolmultipledatabases.product.repository;

import com.at.springboolmultipledatabases.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}