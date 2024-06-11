/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.popular.server.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author onairo
 */

@Entity
@Table(name = "Persona") // Nombre de la tabla en la base de datos
public class Person {
    @Id
    @Column(name = "cedula", nullable = false) // Identificador de la tabla
    private String personID;
    @Column(name = "nombre", nullable = false)
    private String name;
    @Column(name = "apellido", nullable = false)
    private String surname;
    @Column(name = "telefono")
    private String phone;
    @Column(name = "direccion")
    private String address;
    @Column(name = "ciudad")
    private String city;
    
    //Builder
    public Person() {}
    public Person(String personID, String name, String surname, String phone, String address, String city) {
        this.personID = personID;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
        this.city = city;
    }
    
    //Getters
    public String getPersonId() {
        return this.personID;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getPhone() {
        return this.phone;
    }
    public String getAddress() {
        return this.address;
    }
    public String getCity() {
        return this.city;
    }
    
    //Setters
    public void setPersonID(String personID) {
        this.personID = personID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
    //Imprimir información completa
    public void printData() {
        System.out.println("---- Información de la Persona ----");
        System.out.println("Cedula: " + this.personID + "\nNombre: " + this.name + "\nApellido: " + this.surname + "\nTeléfono: " + this.phone + "\nDirección: " + this.address + "\nCiudad: " + this.city);
    }
}
