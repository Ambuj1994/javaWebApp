package com.springweb.javaWebApp.controller;

import com.springweb.javaWebApp.model.Product;
import com.springweb.javaWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
