package com.example.demo.services;

import com.example.demo.entities.Composant;

import java.util.List;

public interface IComposantService {

    List<Composant> retrieveAllComposants();

    Composant addComposant(Composant e);

    Composant updateComposant(Composant e);

    Composant retrieveComposant (Long idComposant);

    void removeCompsant(Long idComposant);

    List<Composant> addComposant (List<Composant> Composants);
}
