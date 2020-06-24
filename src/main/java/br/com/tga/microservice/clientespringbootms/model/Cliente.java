package br.com.tga.microservice.clientespringbootms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Long id;

    @Column
    @Getter @Setter private String name;

    public Cliente(){}

    public Cliente(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Cliente(String name){
        this.name = name;
    }
}