package com.example.demo.services;

import com.example.demo.entities.Chainerestauration;
import com.example.demo.repositories.ChainerestaurationReository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ChainerestaurationService implements IChainerestaurationService{

    ChainerestaurationReository chainerestaurationReository ;

    @Override
    public List<Chainerestauration> retrieveAllChainerestauration() {
        return (List<Chainerestauration>) chainerestaurationReository.findAll() ;
    }

    @Override
    public Chainerestauration addChainerestauration(Chainerestauration e) {
        return chainerestaurationReository.save(e);
    }

    @Override
    public Chainerestauration updateChainerestauration(Chainerestauration e) {
        return chainerestaurationReository.save(e);
    }

    @Override
    public Chainerestauration retrieveChainerestauration(Long idChainerestauration) {
        return chainerestaurationReository.findById(idChainerestauration).get();
    }

    @Override
    public void removeChainerestauration(Long idChainerestauration) {
        chainerestaurationReository.deleteById(idChainerestauration);

    }

    @Override
    public List<Chainerestauration> addChainerestauration(List<Chainerestauration> Chainerestauration) {
        return (List<Chainerestauration>) chainerestaurationReository.saveAll(Chainerestauration);
    }
}
