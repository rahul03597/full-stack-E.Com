package com.DemoFirst.service;

import com.DemoFirst.model.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Getter
@Service
public class ProductService {

List <Product> products =  new ArrayList<>(Arrays.asList(
        new Product(101,"Iphone",5000),
        new Product(102,"Camera",7000),
        new Product(103,"Mic",2000),
        new Product(104,"Ipad",3000)));

    public Product getProductById(int productId) {
        return products.stream().filter(p -> p.getProductId() == productId).findFirst().get();
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }
}
