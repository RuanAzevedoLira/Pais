package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pais;
import com.example.demo.service.PaisService;

@RestController
@RequestMapping("api/p1/Pais") // Melhor para seguir a convenção plural
public class PaisController {

    @Autowired
    private PaisService paisService;

    /*Cread*/
    //Criar um pais
    @PostMapping("/save")
    public Pais creadPais(@RequestBody Pais pais) {
        return paisService.creadPais(pais);
    }

    /*Read*/
    //Ler todos os paises
    @GetMapping
    public List<Pais> findAllPais() {
        return paisService.findAllPais();
    }

    //Ler os id
    @GetMapping
    public Optional<Pais> findById(Long id) {
        return paisService.findById(id);
    }

    //Ler os nomes
    @GetMapping
    public Pais findByCountry (String country){
        return paisService.findByCountry(country);
    }

    //Ler o codigo
    @GetMapping
    public List<Pais> findByCode (String code){
        return paisService.findByCode(code);
    }

    //Ler a latitude
    @GetMapping
    public List<Pais> findByLatitude (String latitude){
        return paisService.findByLatitude(latitude);
    }

    //Ler a longetude
    @GetMapping
    public List<Pais> findByLongetude (String longetude){
        return paisService.findByLongetude(longetude);
    }


    /*@GetMapping
    //Ler a latitude e longetude
    public List<Pais> findByLatitudeLongetude (String latitude, String longetude){
    return paisService.findByLatitudeLongetude(latitude,longetude);
    }*/

    //Update
    // Atualizar País pelo Id
    @PutMapping("id/{id}")
    public Pais updatePeloyById(@PathVariable Long id, @RequestBody Pais updatedPais) {
        return paisService.updateById(id, updatedPais);
    }

    // Atualizar País pelo Nome
    @PutMapping("code/{code}")
    public Pais updatePaisByCountry(@PathVariable String country, @RequestBody Pais updatedPais) {
        return paisService.updateByCountry(country, updatedPais);
    }

    // Atualizar País pelo Codigo
    @PutMapping("code/{code}")
    public Pais updatePaisByCode(@PathVariable String code, @RequestBody Pais updatedPais) {
        return paisService.updateByCode(code, updatedPais);
    }

    //Delete
    // Deletar um livro pelo ID
    @DeleteMapping("/{id}")
    public void deletePaisById(@PathVariable Long id) {
        paisService.deleteById(id);
    }

    // Deletar um livro por gênero
    @DeleteMapping("/country/{country}")
    public void deletaPaisByCountry(@PathVariable String country) {
        paisService.deleteByCountry(country);
    }

    // Deletar um livro por gênero
    @DeleteMapping("/code/{code}")
    public void deletePaisByCode(@PathVariable String code) {
        paisService.deleteByCode(code);
    }

}
