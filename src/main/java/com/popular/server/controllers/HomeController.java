/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.popular.server.controllers;

import com.popular.server.models.Category;
import com.popular.server.models.Product;
import com.popular.server.repository.CategoryRepository;
import com.popular.server.repository.ProductRepository;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author onairo
 */
@Controller
public class HomeController {
    @Autowired
    private ProductRepository productRepostory;
    
    @Autowired
    private CategoryRepository categoryRepostory;
    
    @GetMapping("/")
    public String page(Model model) {
        //Obtener y ordenar productos más comprados
        List<Product> products = productRepostory.findAll();
        products.sort(Comparator.comparingInt(Product::getPurchased).reversed());
        products = products.subList(0, Math.min(4, products.size()));
        
        //Obtener las categorias
        List<Category> categories = categoryRepostory.findAll();
        
        //Enviar los objeto a JSP 
        model.addAttribute("categories", categories);
        model.addAttribute("products", products);
        return "home";
    }
    
}
