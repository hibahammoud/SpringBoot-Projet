package com.example.demo.services;

import com.example.demo.entities.Chefcuisinier;


import java.util.List;

public interface IChefcuisinierService {
    List<Chefcuisinier> retrieveAllChefcuisinier();

    Chefcuisinier addChefcuisinier(Chefcuisinier e);

    Chefcuisinier updateChefcuisinier(Chefcuisinier e);

    Chefcuisinier retrieveChefcuisinier (Long idChefcuisinier);

    void removeChefcuisinier(Long idChefcuisinier);

    List<Chefcuisinier> addChefcuisinier (List<Chefcuisinier> Chefcuisinier);
}
