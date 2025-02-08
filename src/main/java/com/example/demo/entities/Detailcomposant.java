package com.example.demo.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "DetailComposant")
public class Detailcomposant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetailComposant")
    private Long idDetailComposant;

    private Float imc;

    @Enumerated(EnumType.STRING)
    private Typecomposant typeComposant;

    // Getters and setters
    public Long getIdDetailComposant() {
        return idDetailComposant;
    }

    public void setIdDetailComposant(Long idDetailComposant) {
        this.idDetailComposant = idDetailComposant;
    }

    public Float getImc() {
        return imc;
    }

    public void setImc(Float imc) {
        this.imc = imc;
    }

    public Typecomposant getTypeComposant() {
        return typeComposant;
    }

    public void setTypeComposant(Typecomposant typeComposant) {
        this.typeComposant = typeComposant;
    }





}