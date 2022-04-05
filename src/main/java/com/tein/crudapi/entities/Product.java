package com.tein.crudapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product_tbl")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int identity;
    private double price;

}
