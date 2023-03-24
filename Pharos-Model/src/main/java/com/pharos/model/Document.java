package com.pharos.model;


import jakarta.persistence.Entity;

@Entity
@Constructor
@Getter
@Setter
public class Document {

    private int idDoc;
    private String documentId;
    private Boolean enable;

}
