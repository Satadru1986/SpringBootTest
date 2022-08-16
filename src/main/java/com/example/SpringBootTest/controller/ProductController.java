package com.example.SpringBootTest.controller;

import com.example.SpringBootTest.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public String getProduct()
    {
        Product p=new Product("Satadru");
        return p.getName();
    }

}
