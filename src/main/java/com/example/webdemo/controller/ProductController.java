package com.example.webdemo.controller;

import com.example.webdemo.model.Products;
import com.example.webdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @RequestMapping("/Products")
    public List<Products> getProduct(){
        return service.getProducts();
    }

    @RequestMapping("/Products/{prodId}")
    public Products getProductById(@PathVariable int prodId){
        return service.getProductsById(prodId);
    }

    @PostMapping("/Products")
    public void addProduct( @RequestBody Products prod){
        service.addProduct(prod);
    }
    @PutMapping("/Products")
    public void updateProduct(@RequestBody Products prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/Products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
         service.deleteProduct(prodId);
    }

}
