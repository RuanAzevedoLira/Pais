package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Pais {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String country;

    @NonNull
    private String code;

    @NonNull
    private String latitude;

    @NonNull
    private String longitude;


    

}
