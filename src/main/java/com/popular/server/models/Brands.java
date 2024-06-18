/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.popular.server.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author onairo
 */

@Entity
@Table(name = "Marcas") // Nombre de la tabla en la base de datos
public class Brands {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre")
    private String name;
    
    //Getters
    public int getID() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    
    //Setters
    public void setName(String name) {
        this.name = name;
    }
}
