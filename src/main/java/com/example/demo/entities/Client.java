package com.example.demo.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient")
    private Long idClient;

    private String identifiant;

    @Temporal(TemporalType.DATE)
    private Date datePremiereVisite;


    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public Date getDatePremiereVisite() {
        return datePremiereVisite;
    }

    public void setDatePremiereVisite(Date datePremiereVisite) {
        this.datePremiereVisite = datePremiereVisite;
    }
    @OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    private Set<Commande> commandes;


}
