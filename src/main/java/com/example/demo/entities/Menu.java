package com.example.demo.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMenu")
    private Long idMenu;

    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    private Typemenu typeMenu;

    private Float prixTotal;

    // Getters et Setters
    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public String getLibelleMenu() {
        return libelleMenu;
    }

    public void setLibelleMenu(String libelleMenu) {
        this.libelleMenu = libelleMenu;
    }

    public Typemenu getTypeMenu() {
        return typeMenu;
    }

    public void setTypeMenu(Typemenu typeMenu) {
        this.typeMenu = typeMenu;
    }

    public Float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(Float prixTotal) {
        this.prixTotal = prixTotal;
    }


    @OneToMany(cascade = CascadeType.ALL, mappedBy="menu")
    private Set<Commande> commandes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="menu")
    private Set<Composant> composants;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Chefcuisinier> chefcuisiniers;






}
