package com.example.demo.services;

import com.example.demo.entities.Chefcuisinier;
import com.example.demo.entities.Client;
import com.example.demo.repositories.ChefcuisinierRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ChefcuisinierService implements IChefcuisinierService{


    ChefcuisinierRepository chefcuisinierRepository ;
    @Override
    public List<Chefcuisinier> retrieveAllChefcuisinier() {
        return (List<Chefcuisinier>) chefcuisinierRepository.findAll();
    }

    @Override
    public Chefcuisinier addChefcuisinier(Chefcuisinier e) {
         return chefcuisinierRepository.save(e) ;
    }

    @Override
    public Chefcuisinier updateChefcuisinier(Chefcuisinier e) {
        return chefcuisinierRepository.save(e) ;
    }

    @Override
    public Chefcuisinier retrieveChefcuisinier(Long idChefcuisinier) {
        return chefcuisinierRepository.findById(idChefcuisinier).get() ;
    }

    @Override
    public void removeChefcuisinier(Long idChefcuisinier) {
        chefcuisinierRepository.deleteById(idChefcuisinier);
    }

    @Override
    public List<Chefcuisinier> addChefcuisinier(List<Chefcuisinier> Chefcuisinier) {
        return (List<Chefcuisinier>) chefcuisinierRepository.saveAll(Chefcuisinier);
    }
}
