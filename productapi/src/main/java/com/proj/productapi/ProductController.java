package com.proj.productapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    public ProductRepository productRepository;

    @GetMapping("/products")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

}
