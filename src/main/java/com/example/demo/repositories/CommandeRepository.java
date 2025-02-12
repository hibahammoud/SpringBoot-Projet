package com.example.demo.repositories;

import com.example.demo.entities.Commande;
import org.springframework.data.repository.CrudRepository;

public interface CommandeRepository extends CrudRepository <Commande, Long> {

}
