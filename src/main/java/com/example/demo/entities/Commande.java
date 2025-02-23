package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
//@RequiredArgsConstructor
//@EqualsAndHashCode
@Builder
@Table(name = "Commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCommande")
    private Long idCommande;

    private LocalDate dateCommande;

    private Integer pourcentageRemise;

    private Float totalRemise;

    private Float totalCommande;

    private Long note;


   /* public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Integer getPourcentageRemise() {
        return pourcentageRemise;
    }

    public void setPourcentageRemise(Integer pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
    }

    public Float getTotalRemise() {
        return totalRemise;
    }

    public void setTotalRemise(Float totalRemise) {
        this.totalRemise = totalRemise;
    }

    public Float getTotalCommande() {
        return totalCommande;
    }

    public void setTotalCommande(Float totalCommande) {
        this.totalCommande = totalCommande;
    }

    public Long getNote() {
        return note;
    }

    public void setNote(Long note) {
        this.note = note;
    }
*/
    @ManyToOne
    private Client client;

    @ManyToOne
    private Menu menu;


}
