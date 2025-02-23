package com.example.demo.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


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
@Table(name = "Composant")
public class Composant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idComposant")
    private Long idComposant;

    private String nomComposant;

    private Float prix;

    // Getters and Setters
    /*public Long getIdComposant() {
        return idComposant;
    }

    public void setIdComposant(Long idComposant) {
        this.idComposant = idComposant;
    }

    public String getNomComposant() {
        return nomComposant;
    }

    public void setNomComposant(String nomComposant) {
        this.nomComposant = nomComposant;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }*/

    @ManyToOne
    private Menu menu;

    @OneToOne
    private Detailcomposant detailComposant;


}

