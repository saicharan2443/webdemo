package com.example.webdemo.controller;

import com.example.webdemo.model.Products;
import com.example.webdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @RequestMapping("/Products")
    public List<Products> getProduct(){
        return service.getProducts();
    }

}
