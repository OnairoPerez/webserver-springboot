/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.popular.server.controllers;

import com.popular.server.models.Account;
import com.popular.server.repository.AccountRepository;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author onairo
 */

@RestController
public class AccountRestController {
    @Autowired
    AccountRepository repository;
    
    @PostMapping("/api/account/save")
    public String post(@RequestBody Account account) {
        account.setHash();
        repository.save(account);
        return "{\"status\":\"done\"}";
    }
    
    @PostMapping("/api/account/verify")
    public String veriry(@RequestBody Map<String, Object> keyValue) {
        if (keyValue.containsKey("email") && keyValue.containsKey("password")) {
            //Obtener los valore enviados en la petición
            String email = keyValue.get("email").toString();
            String password = keyValue.get("password").toString();
            
            //Obtener objeto
            Optional<Account> obj = repository.findById(email);
            if (obj.isPresent()) {
                //Obtenemos el objeto
                Account account = obj.get();
                //Verificamos si el hash coincide
                if (account.verify(password)) {
                    return "{\"status\": \"correct-data\"}";
                } else {
                    return "{\"status\": \"incorrect-password\"}";
                }
            } else {
                return "{\"status\": \"user-not-found\"}";
            }
        } else {
            return "{\"status\": \"arg-missing\"}";
        }
    }
}
