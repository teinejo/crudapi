package com.tein.crudapi.controllers;

import com.tein.crudapi.entities.Product;
import com.tein.crudapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> saveProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/getProductId/{id}")
    public Product getProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @GetMapping("/getProductName/{name}")
    public Product getProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }

    @GetMapping("/sort")
    public List<Product> getSortProductByPrice(){
        return service.getSortedProductsByValue();
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }



}
