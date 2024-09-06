package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Pais;
import com.example.demo.repository.PaisRepository;

public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    //Cread

    public Pais creadPais(Pais pais) {
        return paisRepository.save(pais);
    }

    //Read

    public List<Pais> findAllPais() {
        return paisRepository.findAll();
    }

    public Optional<Pais> findById(Long id) {
        return paisRepository.findById(id);
    }

    public Pais findByCountry (String country){
        return paisRepository.findByCountry(country);
    }

    public List<Pais> findByCode (String code){
        return paisRepository.findByCode(code);
    }

    public List<Pais> findByLatitude (String latitude){
        return paisRepository.findByLatitude(latitude);
    }

    public List<Pais> findByLongetude (String longetude){
        return paisRepository.findByLongetude(longetude);
    }

    /*public List<Pais> findByLatitudeLongetude (String latitude, String longetude){
    return paisRepository.findByLatitudeLongetude(latitude,longetude);
    }*/


    // Update

    public Pais updateById(Long id, Pais updatedPais) {
        Optional<Pais> existingPais = paisRepository.findById(id);
        if (existingPais.isPresent()) {
            Pais pais = existingPais.get();
            pais.setCountry(updatedPais.getCountry());
            pais.setCode(updatedPais.getCode());
            pais.setLatitude(updatedPais.getLatitude());
            pais.setLongitude(updatedPais.getLongitude());
            return paisRepository.save(pais);
        }
        return null; // ou lançar uma exceção se o ID não for encontrado
    }


    public Pais updateByCountry(String country, Pais updatedPais) {
        Pais pais = paisRepository.findByCountry(country);
        if (pais != null) {
            pais.setCountry(updatedPais.getCountry());
            pais.setCode(updatedPais.getCode());
            pais.setLatitude(updatedPais.getLatitude());
            pais.setLongitude(updatedPais.getLongitude());
            return paisRepository.save(pais);
        }
        return null;
    }

    public Pais updateByCode(String code, Pais updatedPais) {
        List<Pais> paises = paisRepository.findByCode(code);
        if (!paises.isEmpty()) {
            Pais pais = paises.get(0); // Assume que está atualizando apenas o primeiro país encontrado com esse código
            pais.setCountry(updatedPais.getCountry());
            pais.setCode(updatedPais.getCode());
            pais.setLatitude(updatedPais.getLatitude());
            pais.setLongitude(updatedPais.getLongitude());
            return paisRepository.save(pais);
        }
        return null;
    }

    public Pais updateByLatitude(String latitude, Pais updatedPais) {
        List<Pais> paises = paisRepository.findByLatitude(latitude);
        if (!paises.isEmpty()) {
            Pais pais = paises.get(0); // Assume que está atualizando apenas o primeiro país encontrado com essa latitude
            pais.setCountry(updatedPais.getCountry());
            pais.setCode(updatedPais.getCode());
            pais.setLatitude(updatedPais.getLatitude());
            pais.setLongitude(updatedPais.getLongitude());
            return paisRepository.save(pais);
        }
        return null;
    }

    public Pais updateByLongitude(String longitude, Pais updatedPais) {
        List<Pais> paises = paisRepository.findByLongetude(longitude);
        if (!paises.isEmpty()) {
            Pais pais = paises.get(0); // Assume que está atualizando apenas o primeiro país encontrado com essa longitude
            pais.setCountry(updatedPais.getCountry());
            pais.setCode(updatedPais.getCode());
            pais.setLatitude(updatedPais.getLatitude());
            pais.setLongitude(updatedPais.getLongitude());
            return paisRepository.save(pais);
        }
        return null;
    }

    /*public Pais updateByLatitudeLongitude(String latitude, String longitude, Pais updatedPais) {
        List<Pais> paises = paisRepository.findByLatitude(latitude);
        for (Pais pais : paises) {
            if (pais.getLongitude().equals(longitude)) {
                pais.setCountry(updatedPais.getCountry());
                pais.setCode(updatedPais.getCode());
                pais.setLatitude(updatedPais.getLatitude());
                pais.setLongitude(updatedPais.getLongitude());
                return paisRepository.save(pais);
            }
        }
        return null; // ou lançar uma exceção se a combinação não for encontrada
    }*/

    //Delete
    public void deleteById (Long id){
        paisRepository.deleteById(id);
    }

    public void deleteByCountry (String country){
        paisRepository.deleteByCountry(country);
    }
    
    public void deleteByCode (String code){
        paisRepository.deleteByCode(code);
    }

    public void deleteByLatitude (String latitude){
        paisRepository.deleteByLatitude(latitude);
    }

    public void deleteByLongitude (String longetude){
        paisRepository.deleteByLongitude(longetude);
    }

    /*public void delteByLatitudeLongetude (String latitude, String longetude){
        paisRepository.deleteByLatitudeLongetude(latitude,longetude);
    }*/

}
