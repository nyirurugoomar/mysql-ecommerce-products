
package com.crudpractice.springbootpractice_crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudpractice.springbootpractice_crud.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // find all products by category
    List<Product> findByCategory(String name);


    // find all products by price
    List<Product> findProductByPriceLessThanEqual(Double maxPrice);


    // find product that contains the name(case insensitive)
    List<Product> findProductByNameContainingIgnoreCase(String name);
}
