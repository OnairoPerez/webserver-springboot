/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.popular.server.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import org.springframework.security.crypto.bcrypt.BCrypt;


/**
 *
 * @author onairo
 */

@Entity
@Table(name = "Cuenta") // Nombre de la tabla en la base de datos
public class Account {
    @Id
    @Column(name = "correo")
    private String email;

    @Column(name = "hash")
    private String hash;

    @Column(name = "salt")
    private String salt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona_cedula")
    private Person person;
    
    @Transient
    private String password;
    
    //Builder
    public Account() {}
    
    //Getters
    public String getEmail() {
        return this.email;
    }
    public String getHash() {
        return this.hash;
    }
    public String getSalt() {
        return this.salt;
    }
    public Person getPerson() {
        return this.person;
    }
    public String getPassword() {
        return this.password;
    }
    
    //Setters
    public void setEmail(String email) {
        this.email = email;
    }
    public void setHash() {
        this.salt = BCrypt.gensalt();
        this.hash = BCrypt.hashpw(this.password, this.salt);
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    
    //Otras funciones
    public boolean verify(String password) {
        String reqHash = BCrypt.hashpw(password, this.salt);   
        return this.hash.equals(reqHash);
    }

}
