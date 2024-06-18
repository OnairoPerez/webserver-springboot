/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.popular.server.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.UUID;



/**
 *
 * @author onairo
 */

@Entity
@Table(name = "Productos") // Nombre de la tabla en la base de datos
public class Product {
    @Id
    @Column(name = "codigo")
    private String code;
    @Column(name = "nombre")
    private String name;
    @Column(name = "precio")
    private float price;
    @Column(name = "existencias")
    private int stock;
    @Column(name = "comprados")
    private int purchased;
    @Column(name = "image")
    private String img;
    @Column(name = "descripcion")
    private String description;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_category")
    private Category category;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_marca")
    private Brands brand;
    
    //Getters
    public String getCode() {
        return this.code;
    }
    public String getName() {
        return this.name;
    }
    public float getPrice() {
        return this.price;
    }
    public int getStock() {
        return this.stock;
    }
    public int getPurchased() {
        return this.purchased;
    }
    public String getImg() {
        return this.img;
    }
    public Category getCategory() {
        return this.category;
    } 
    public Brands getBrand() {
        return this.brand;
    }
    public String getDescription() {
        return this.description;
    }
    
    //Setters
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setPurchased(int purchased) {
        this.purchased = purchased;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public void setBrand(Brands brand) {
        this.brand = brand;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    //Otras funciones
    public String localPrice() {
        Locale colombia = new Locale("es", "CO");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(colombia);
        numberFormat.setMaximumFractionDigits(0);
        return numberFormat.format(this.price);
    }
}
