/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.popular.server.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author onairo
 */
@Controller
public class AccountController {
    
    @GetMapping("/login")
    public String index() {
        return "login";
    }
    
    @GetMapping("register")
    public String reg() {
        return "register";
    }
}
