package com.resident.springtut.service;

import com.resident.springtut.model.Product;
import com.resident.springtut.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>( Arrays.asList(new Product(101,"Iphones",50000),
//            new Product(102,"Camera",50000),
//            new Product(103,"Laptop",50000),
//            new Product(104,"Mouse",500)));

     public List<Product> getproducts() {
         return repo.findAll();
     }

     public Product getproductsbyId(int productId) {
         return repo.findById(productId).get();
     }

     public void addProduct(Product prod){
         repo.save(prod);
     }

    public void updateProduct(Product prod) {
         repo.save(prod);
    }

    public void deleteProduct(int prodId) {
      repo.deleteById(prodId);
    }
}
