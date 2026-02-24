package com.application.CategoryProduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.application.CategoryProduct.service.CategoryService;

@RestController
public class HelloController {
    @Autowired 
    private  CategoryService CategoryService;
    @GetMapping("/hello/{message}")
    public String hello(@PathVariable String message){
        return "Hello everyone! "+message;
    }
}

