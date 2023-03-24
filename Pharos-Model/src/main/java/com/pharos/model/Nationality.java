package com.pharos.model;


import jakarta.persistence.Entity;

@Entity
@Constructor
@Getter
@Setter
public class Nationality {

    private int idNationality;
    private String nationalityVal;
    private Boolean enable;

}
