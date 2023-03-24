package com.pharos.model;

import jakarta.persistence.Entity;

@Entity
@Constructor
@Getter
@Setter
public class Gender {

    private int idGender;
    private String genderVal;
    private Boolean enable;

}
