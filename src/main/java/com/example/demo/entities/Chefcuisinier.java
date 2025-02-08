package com.example.demo.entities;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "ChefCuisinier")
public class Chefcuisinier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChefCuisinier")
    private Long idChefCuisinier;

    private String nom;

    private String prenom;

    @Enumerated(EnumType.STRING)
    private Typechef typeChef;

    // Getters and Setters
    public Long getIdChefCuisinier() {
        return idChefCuisinier;
    }

    public void setIdChefCuisinier(Long idChefCuisinier) {
        this.idChefCuisinier = idChefCuisinier;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Typechef getTypeChef() {
        return typeChef;
    }

    public void setTypeChef(Typechef typeChef) {
        this.typeChef = typeChef;
    }

    @ManyToMany(mappedBy="chefcuisiniers", cascade = CascadeType.ALL)
    private Set<Menu> menus;

}
