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
@Table(name = "Categorias") // Nombre de la tabla en la base de datos
public class Category {
    @Id
    @Column(name = "id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre")
    private String name;
    @Column(name = "image")
    private String img;
    @Column(name = "valor")
    private String value;
    
    //Getters
    public int getID() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getImg() {
        return this.img;
    }
    public String getValue() {
        return this.value;
    }
    
    //Setters
    public void setID(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
