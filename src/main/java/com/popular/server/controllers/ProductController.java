/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.popular.server.controllers;

import com.popular.server.models.Product;
import com.popular.server.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author onairo
 */
@Controller
public class ProductController {
    @Autowired
    ProductRepository repository;
    
    @GetMapping("/product")
    public String page(Model model, @RequestParam String id) {
        Product product = repository.findById(id).get();
        model.addAttribute("product", product);
        return "products";
    }
    
}
