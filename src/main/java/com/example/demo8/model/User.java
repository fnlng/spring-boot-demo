package com.example.demo8.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    
    
    @Id
    @GeneratedValue
    Long userId;


    @Column(name = "name")
    String userName;


    @Column(name = "balance", nullable = true)
    double balance;
}
