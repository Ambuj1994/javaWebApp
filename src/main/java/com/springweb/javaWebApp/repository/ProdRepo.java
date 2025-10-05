package com.springweb.javaWebApp.repository;

import com.springweb.javaWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdRepo extends JpaRepository<Product, Integer> {

}
