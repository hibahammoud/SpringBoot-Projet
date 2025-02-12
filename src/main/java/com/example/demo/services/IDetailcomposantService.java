package com.example.demo.services;

import com.example.demo.entities.Detailcomposant;

import java.util.List;

public interface IDetailcomposantService {
    List<Detailcomposant> retrieveAllDetailcomposant();

    Detailcomposant addDetailcomposant(Detailcomposant e);

    Detailcomposant updateDetailcomposant(Detailcomposant e);

    Detailcomposant retrieveDetailcomposant (Long idDetailComposant);

    void removeDetailcomposant(Long idDetailComposant);

    List<Detailcomposant> addDetailcomposant (List<Detailcomposant> Detailcomposants);

}
