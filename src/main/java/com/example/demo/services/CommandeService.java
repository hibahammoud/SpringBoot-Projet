package com.example.demo.services;


import com.example.demo.entities.Commande;
import com.example.demo.repositories.CommandeRepository;

import java.util.List;

public class CommandeService implements ICommandeService{

    CommandeRepository commandeRepository ;
    @Override
    public List<Commande> retrieveAllCommandes() {
        return (List<Commande>) commandeRepository.findAll();
    }

    @Override
    public Commande addCommandes(Commande e) {
        return commandeRepository.save(e) ;
    }

    @Override
    public Commande updateCommandes(Commande e) {
        return commandeRepository.save(e) ;
    }

    @Override
    public Commande retrieveCommandes(Long idCommande) {
        return commandeRepository.findById(idCommande).get() ;
    }

    @Override
    public void removeCommandes(Long idCommande) {
        commandeRepository.deleteById(idCommande);
    }

    @Override
    public List<Commande> addCommandes(List<Commande> Commandes) {
        return (List<Commande>) commandeRepository.saveAll(Commandes);
    }
}
