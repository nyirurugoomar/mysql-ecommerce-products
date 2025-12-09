
package com.crudpractice.springbootpractice_crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.crudpractice.springbootpractice_crud.model.Product;
import com.crudpractice.springbootpractice_crud.repository.ProductRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;


    //get all products
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    //get product by id
    public Optional<Product> getProductByIdOptional(Long id) {
        return productRepository.findById(id);
    }

    //get product by Category
    public List<Product> getProductByCategory(String categoryName) {
        return productRepository.findByCategory(categoryName); 
    }

    //get product by price less than equal
    public List<Product> getProductByPriceLessThanEqual(Double maxPrice) {
        return productRepository.findProductByPriceLessThanEqual(maxPrice);
    }

    //get product by name containing
    public List<Product> getProductByNameContaining(String name) {
        return productRepository.findProductByNameContainingIgnoreCase(name);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    //create product
   public Product createProduct(Product product) {
    return productRepository.save(product);
   }

   //update product
   public Product updateProduct(Long id, Product product) {
    return productRepository.save(product);
   }

   //delete product
   public void deleteProduct(Long id) {
    productRepository.deleteById(id);
   }
}
