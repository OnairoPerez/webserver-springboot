/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.popular.server.controllers;

import com.popular.server.models.Product;
import com.popular.server.repository.ProductRepository;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author onairo
 */
@Controller
public class SearchEngineController {
    
    @Autowired
    ProductRepository productRepository;
    
    @GetMapping("/search")
    public String page(Model model) {
        //Obtener productos
        List<Product> products = productRepository.findAll();
        
        //Obtener marcas sin repetir
        Set<String> brands = new HashSet<>();
        for(Product item : products) {
            String brand = item.getBrand().getName();
            brands.add(brand);
        }
        
        model.addAttribute("brands", brands);
        model.addAttribute("products", products);
        return "searchEngine";
    }
    
}
