package com.example.demo.services;


import com.example.demo.entities.Detailcomposant;
import com.example.demo.repositories.DetailcomposantRepository;

import java.util.List;

public class DetailcomposantService implements IDetailcomposantService{
    DetailcomposantRepository detailcomposantRepository ;
    @Override
    public List<Detailcomposant> retrieveAllDetailcomposant() {
        return (List<Detailcomposant>) detailcomposantRepository.findAll();
    }

    @Override
    public Detailcomposant addDetailcomposant(Detailcomposant e) {
        return detailcomposantRepository.save(e) ;
    }

    @Override
    public Detailcomposant updateDetailcomposant(Detailcomposant e) {
        return detailcomposantRepository.save(e) ;
    }

    @Override
    public Detailcomposant retrieveDetailcomposant(Long idDetailComposant) {
        return detailcomposantRepository.findById(idDetailComposant).get() ;
    }

    @Override
    public void removeDetailcomposant(Long idDetailComposant) {
        detailcomposantRepository.deleteById(idDetailComposant);

    }

    @Override
    public List<Detailcomposant> addDetailcomposant(List<Detailcomposant> Detailcomposants) {
        return (List<Detailcomposant>) detailcomposantRepository.saveAll(Detailcomposants);
    }
}
