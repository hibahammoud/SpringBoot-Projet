package com.example.demo.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "ChaineRestauration")
public class Chainerestauration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChaineRestauration")
    private Long idChaineRestauration;

    private String libelle;

    private LocalDate dateCreation;

    // Getters and Setters
    public Long getIdChaineRestauration() {
        return idChaineRestauration;
    }

    public void setIdChaineRestauration(Long idChaineRestauration) {
        this.idChaineRestauration = idChaineRestauration;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }
    @OneToMany(cascade = CascadeType.ALL, mappedBy="chaineRestauration")
    private Set<Restaurant> restaurants;


}
