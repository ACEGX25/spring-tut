package com.resident.springtut.service;

import com.resident.springtut.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>( Arrays.asList(new Product(101,"Iphones",50000),
            new Product(102,"Camera",50000),
            new Product(103,"Laptop",50000),
            new Product(104,"Mouse",500)));

     public List<Product> getproducts() {
         return products;
     }

     public Product getproductsbyId(int productId) {
         return products.stream()
                 .filter(p -> p.getProductId() == productId)
                 .findFirst().orElse(null);
     }

     public void addProduct(Product prod){
         products.add(prod);
     }

    public void updateProduct(Product prod) {
         int index =0;
         for (int i = 0; i < products.size(); i++)
             if (products.get(i).getProductId() == prod.getProductId())
                index = i;
         products.set(index,prod);
    }

    public void deleteProduct(int prodId) {
        int index =0;
        for (int i = 0; i < products.size(); i++)
            if (products.get(i).getProductId() == prodId)
                index = i;
        products.remove(index);
    }
}
