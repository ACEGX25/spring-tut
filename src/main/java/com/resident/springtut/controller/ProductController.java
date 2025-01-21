package com.resident.springtut.controller;

import com.resident.springtut.model.Product;
import com.resident.springtut.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;


    @GetMapping("/prod")
    public List<Product> getProduct(){
        return service.getproducts();
    }

    @GetMapping("prod/{productId}")
    public Product getproductbyid( @PathVariable int productId){
        return service.getproductsbyId(productId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }

    @PutMapping("/update")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{productId}")
   public void deleteProduct(@PathVariable int productId){
        service.deleteProduct(productId);
   }

}
