package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Pais;
import java.util.List;


public interface PaisRepository extends JpaRepository<Pais,Long> {

    /*Em todos os repositorios de interface JPA: cread, delete, deleteById, findAll, findById*/


    //Read
    public Pais findByCountry (String country);
    public List<Pais> findByCode (String code);
    public List<Pais> findByLatitude (String latitude);
    public List<Pais> findByLongetude (String longetude);
    //public List<Paises> findByLatitudeLongetude (String latitude, String longetude);

    //Update
    public Pais updateByCountry (String country);
    public Pais updateByCode (String code);
    public Pais updateByLatitude (String latitude);
    public Pais updateByLongitude (String longetude);
    //public Paises updatebyLatitudeLongetude (String latitude, String longetude);

    //Delete
    public void deleteByCountry (String country);
    public void deleteByCode (String code);
    public void deleteByLatitude (String latitude);
    public void deleteByLongitude (String longetude);
    //public void delteByLatitudeLongetude (String latitude, String longetude);

}
