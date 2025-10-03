package com.springweb.javaWebApp.service;


import com.springweb.javaWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    List<Product> prodArr = Arrays.asList(
            new Product(501, "Samsung", 70000),
            new Product(502, "JBL", 8000),
            new Product(503, "Harry Potter Wand", 999000)
    );
    public List<Product> getProducts(){
           return prodArr;
    }
}
