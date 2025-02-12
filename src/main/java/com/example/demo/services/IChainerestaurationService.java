package com.example.demo.services;
import com.example.demo.entities.Chainerestauration;

import java.util.List ;

public interface IChainerestaurationService {
    List<Chainerestauration> retrieveAllChainerestauration();

    Chainerestauration addChainerestauration(Chainerestauration e);

    Chainerestauration updateChainerestauration(Chainerestauration e);

    Chainerestauration retrieveChainerestauration (Long idChainerestauration);

    void removeChainerestauration(Long idChainerestauration);

    List<Chainerestauration> addChainerestauration (List<Chainerestauration> Chainerestauration);
}
