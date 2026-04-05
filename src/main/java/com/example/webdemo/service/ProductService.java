package com.example.webdemo.service;

import com.example.webdemo.model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Products> products=new ArrayList<>( Arrays.asList(
            new Products(1,"laptop",50000),
            new Products(2,"mobile",20000)));

    public List<Products> getProducts(){
        return products;

    }

    public Products getProductsById(int prodId) {
        for(Products i:products){
            if(i.getProId()==prodId){
                return i;
            }
        }
        return new Products(100,"No item",0);
    }

    public void addproduct(Products prod) {
        products.add(prod);
    }
}
