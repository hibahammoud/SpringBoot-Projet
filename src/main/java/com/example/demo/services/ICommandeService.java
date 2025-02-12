package com.example.demo.services;

import com.example.demo.entities.Commande;

import java.util.List;

public interface ICommandeService {

    List<Commande> retrieveAllCommandes();

    Commande addCommandes(Commande e);

    Commande updateCommandes(Commande e);

    Commande retrieveCommandes (Long idCommande);

    void removeCommandes(Long idCommande);

    List<Commande> addCommandes (List<Commande> Clients);
}
