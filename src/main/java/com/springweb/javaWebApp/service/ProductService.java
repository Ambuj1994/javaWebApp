package com.springweb.javaWebApp.service;


import com.springweb.javaWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    List<Product> prodArr = new ArrayList<>( Arrays.asList(
            new Product(501, "Samsung", 70000),
            new Product(502, "JBL", 8000),
            new Product(503, "Harry Potter Wand", 999000)
    ));
    public List<Product> getProducts(){
           return prodArr;
    }

    public Product getProdId(int prodId){
        return prodArr.stream()
        .filter(p -> p.getProdId() == prodId)
        .findFirst().orElse(new Product(0, "NO PRODUCT", 0));
//      .findFirst().get();
    }

    public void addProd(Product prod){
        prodArr.add(prod);
    }

    public void updateProduct(Product prod) {
        int idx = 0;
        for(int i=0;i<prodArr.size();i++){
            if(prodArr.get(i).getProdId() == prod.getProdId()){
                idx = i;
                break;
            }
        }
        prodArr.set(idx, prod);
    }

    public String deleteProd(int prodId){
        int idx = -1;
        for(int i=0;i<prodArr.size();i++){
            if(prodArr.get(i).getProdId() == prodId){
                idx = i;
                break;
            }
        }
        if(idx == -1) return "Id not found...";
        prodArr.remove(idx);
        return "Id removed";
    }
}
