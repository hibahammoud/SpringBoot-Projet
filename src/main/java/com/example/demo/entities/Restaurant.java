package com.example.demo.entities;
import jakarta.persistence.*;
import java.util.Set;


@Entity
@Table(name = "Restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRestaurant")
    private Long idRestaurant;

    private String nom;

    private Long nbPlacesMax;

    // Getters et Setters
    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getNbPlacesMax() {
        return nbPlacesMax;
    }

    public void setNbPlacesMax(Long nbPlacesMax) {
        this.nbPlacesMax = nbPlacesMax;
    }

    @ManyToOne
    private Chainerestauration chaineRestauration;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Menu> menus;
    // Constructeurs, getters et setters
}