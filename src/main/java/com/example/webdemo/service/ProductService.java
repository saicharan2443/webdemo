package com.example.webdemo.service;

import com.example.webdemo.model.Products;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Products> products= Arrays.asList(
            new Products(1,"laptop",50000),
            new Products(2,"mobile",20000));
    public List<Products> getProducts(){
        return products;

    }
}
