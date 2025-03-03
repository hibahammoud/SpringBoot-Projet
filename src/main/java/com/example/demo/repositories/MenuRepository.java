package com.example.demo.repositories;

import com.example.demo.entities.Composant;
import com.example.demo.entities.Menu;
import com.example.demo.entities.Typecomposant;
import com.example.demo.entities.Detailcomposant;
import com.example.demo.entities.Typemenu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Long> {

    // Requête 1 : Trouver les menus par type de menu et dont la somme des prix des composants est supérieure à un montant donné
    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(Typemenu typeMenu, Float prix);

    // Requête 2 : Trouver les noms des menus par type de menu, ordonnés par prix total
    @Query("SELECT m.libelleMenu FROM Menu m WHERE m.typeMenu = :typeMenu ORDER BY m.prixTotal")
    List<String> findMenuNamesByTypeMenuOrderByPrixTotal(@Param("typeMenu") Typemenu typeMenu);

    // Requête 3 : Trouver les menus par type de composant
    @Query("SELECT c FROM Composant c WHERE c.menu.idMenu = :menuId AND c.detailComposant.typeComposant = :typeComposant")
    List<Composant> findComposantsByMenuAndType(@Param("menuId") Long menuId, @Param("typeComposant") Typecomposant typeComposant);

}