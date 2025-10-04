package com.springweb.javaWebApp.controller;

import com.springweb.javaWebApp.model.Product;
import com.springweb.javaWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ProdController {

    @Autowired
    ProductService service;


    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProdId(prodId);
    }

    @PostMapping("/products")
    public void addProductToCart(@RequestBody Product prod){
          service.addProd(prod);
    }

    @PutMapping("/products")
    public void editProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public String deleteProduct(@PathVariable int prodId){
        return service.deleteProd(prodId);
    }
}
