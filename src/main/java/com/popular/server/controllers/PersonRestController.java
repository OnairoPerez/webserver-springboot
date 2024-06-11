/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.popular.server.controllers;

import com.popular.server.models.Person;
import com.popular.server.repository.PersonRepository;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author onairo
 */

@RestController
public class PersonRestController {
    @Autowired
    private PersonRepository repository;
    
    @PostMapping("/person/get")
    public Person getPerson(@RequestBody Map<String, Object> keyValue) {
         if (keyValue.containsKey("personID")) {
            String value = keyValue.get("personID").toString();
            return repository.findById(value).get();
        } else {
            return new Person();
        }
    }
    
    @PostMapping("/person/save")
    public String post(@RequestBody Person person) {
        repository.save(person);
        return "{\"status\":\"done\"}";
    }
}
