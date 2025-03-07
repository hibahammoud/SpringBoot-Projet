package com.example.demo.repositories;

import com.example.demo.entities.Restaurant;
//import com.example.demo.entities.Chainerestauration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    List<Restaurant> findByNbPlacesMaxGreaterThanAndChaineRestauration_DateCreationBefore(Integer nbPlaces, LocalDate date);
}