package com.example.demo.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Commande;

@Repository
public interface CommandeRepository extends CrudRepository<Commande, Long> {
    List<Commande> findByClientIdClient(Long idClient);
    List<Commande> findByClientIdClientAndDateCommandeBetween(Long idClient, LocalDate startDate, LocalDate endDate);
    List<Commande> findByDateCommandeBetweenOrderByNoteAscPrixTotalAsc(LocalDate startDate, LocalDate endDate);
}