package com.example.SpringBootTest;

import com.example.SpringBootTest.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestApplication.class, args);

        myMethod();
    }

    private static void myMethod() {
        Product p = new Product("satadru");


        System.out.println("My name is :::----"+p.getName());
    }


}

