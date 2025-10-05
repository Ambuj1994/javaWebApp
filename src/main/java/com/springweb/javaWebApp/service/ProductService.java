package com.springweb.javaWebApp.service;


import com.springweb.javaWebApp.model.Product;
import com.springweb.javaWebApp.repository.ProdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {


//    -----------------------------WITHOUT JPA----------------------------------------------
//    List<Product> prodArr = new ArrayList<>( Arrays.asList(
//            new Product(501, "Samsung", 70000),
//            new Product(502, "JBL", 8000),
//            new Product(503, "Harry Potter Wand", 999000)
//    ));
//    public List<Product> getProducts(){
//           return prodArr;
//    }
//
//    public Product getProdId(int prodId){
//        return prodArr.stream()
//        .filter(p -> p.getProdId() == prodId)
//        .findFirst().orElse(new Product(0, "NO PRODUCT", 0));
////      .findFirst().get();
//    }
//
//    public void addProd(Product prod){
//        prodArr.add(prod);
//    }
//
//    public void updateProduct(Product prod) {
//        int idx = 0;
//        for(int i=0;i<prodArr.size();i++){
//            if(prodArr.get(i).getProdId() == prod.getProdId()){
//                idx = i;
//                break;
//            }
//        }
//        prodArr.set(idx, prod);
//    }
//
//    public String deleteProd(int prodId){
//        int idx = -1;
//        for(int i=0;i<prodArr.size();i++){
//            if(prodArr.get(i).getProdId() == prodId){
//                idx = i;
//                break;
//            }
//        }
//        if(idx == -1) return "Id not found...";
//        prodArr.remove(idx);
//        return "Id removed";


    // --------------------WITH JPA----------------------------

       @Autowired
       ProdRepo repo;

       public List<Product> getProducts() {
           return repo.findAll();
       }

       public Product getProductById(int prodId) {
           return repo.findById(prodId).orElse(new Product());
       }

       public void addProd(Product prod) {
           repo.save(prod);
       }

       public void updateProd(Product prod){
           repo.save(prod);
       }

       public void deleteProdById(int prodId){
           repo.deleteById(prodId);
       }

    public void addMultipleProducts(List<Product> products) {
          repo.saveAll(products);
    }
}
