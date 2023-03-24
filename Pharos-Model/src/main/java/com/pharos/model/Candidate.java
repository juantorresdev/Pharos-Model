package com.pharos.model;

import jakarta.persistence.Entity;

@Entity
@Constructor
@Getter
@Setter
public class Candidate {

    private int idCandidate;
    private String pharosId;
    private String name;
    private String lastname;
    private Calendar birthdate;
    private String email;
    private String phone;
    private Boolean enable;
    private Boolean status;
    private String activationCode;
    private int documentId;
    private int genderId;
    private int nationalityId;

}
