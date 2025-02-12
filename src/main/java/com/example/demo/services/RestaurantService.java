package com.example.demo.services;

import com.example.demo.entities.Client;
import com.example.demo.entities.Restaurant;
import com.example.demo.repositories.RestaurantRepository;

import java.util.List;

public class RestaurantService implements IRestaurantService{
    RestaurantRepository restaurantRepository ;
    @Override
    public List<Restaurant> retrieveAllRestauranrs() {
        return (List<Restaurant>) restaurantRepository.findAll();
    }

    @Override
    public Restaurant addRestaurant(Restaurant e) {
        return restaurantRepository.save(e) ;
    }

    @Override
    public Restaurant updateRestaurant(Restaurant e) {
        return restaurantRepository.save(e) ;
    }

    @Override
    public Restaurant retrieveRestaurant(Long idRestaurant) {
        return restaurantRepository.findById(idRestaurant).get() ;
    }

    @Override
    public void removeRestaurant(Long idRestaurant) {
        restaurantRepository.deleteById(idRestaurant);


    }

    @Override
    public List<Restaurant> addRestaurants(List<Restaurant> Restaurants) {
        return (List<Restaurant>) restaurantRepository.saveAll(Restaurants);
    }
}
