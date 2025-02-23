package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
@FieldDefaults (level = AccessLevel.PRIVATE)
//@RequiredArgsConstructor
//@EqualsAndHashCode
@Builder

@Table(name = "Client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient")
    private Long idClient;
    //@NonNull
    private String identifiant;
    //@NonNull
    @Temporal(TemporalType.DATE)
    private Date datePremiereVisite;


    /*public Long getIdClient() {
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
    }*/
    @OneToMany(cascade = CascadeType.ALL, mappedBy="client")
    private Set<Commande> commandes;

    /*public Client(Long idClient, String identifiant, Date datePremiereVisite, Set<Commande> commandes) {
        this.idClient = idClient;
        this.identifiant = identifiant;
        this.datePremiereVisite = datePremiereVisite;
        this.commandes = commandes;
    }*/

    /*public Client() {
    }*/

    /*@Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", identifiant='" + identifiant + '\'' +
                ", datePremiereVisite=" + datePremiereVisite +
                ", commandes=" + commandes +
                '}';
    }*/

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(idClient, client.idClient) && Objects.equals(identifiant, client.identifiant) && Objects.equals(datePremiereVisite, client.datePremiereVisite) && Objects.equals(commandes, client.commandes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient, identifiant, datePremiereVisite, commandes);
    }*/
}
