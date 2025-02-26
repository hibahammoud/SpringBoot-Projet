package com.example.demo.services;


import com.example.demo.entities.Composant;
import com.example.demo.repositories.ComposantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ComposantService implements IComposantService{
    ComposantRepository composantRepository ;
    @Override
    public List<Composant> retrieveAllComposants() {
        return (List<Composant>) composantRepository.findAll();
    }

    @Override
    public Composant addComposant(Composant e) {
        return composantRepository.save(e) ;
    }

    @Override
    public Composant updateComposant(Composant e) {
        return composantRepository.save(e) ;
    }

    @Override
    public Composant retrieveComposant(Long idComposant) {
        return composantRepository.findById(idComposant).get() ;
    }

    @Override
    public void removeCompsant(Long idComposant) {
        composantRepository.deleteById(idComposant);

    }

    @Override
    public List<Composant> addComposant(List<Composant> Composants) {
        return (List<Composant>) composantRepository.saveAll(Composants);
    }
}
