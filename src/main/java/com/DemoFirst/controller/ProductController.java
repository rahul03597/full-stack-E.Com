package com.DemoFirst.controller;


import com.DemoFirst.model.Product;
import com.DemoFirst.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

//    to get all data
    @GetMapping("/products")
     public List<Product> getProducts(){
         return  service.getProducts();
     }

//     get data by id
     @GetMapping("/products/{productId}")
     public Product getProductById(@PathVariable int productId){
        return service.getProductById(productId);
     }
     @PostMapping("/products")
     public void addProduct( @RequestBody Product prod){
        System.out.println(prod);
      service.addProduct(prod);
    }
}

