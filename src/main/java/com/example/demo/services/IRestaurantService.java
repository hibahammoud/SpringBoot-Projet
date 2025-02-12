package com.example.demo.services;

import com.example.demo.entities.Restaurant;

import java.util.List;

public interface IRestaurantService {

    List<Restaurant> retrieveAllRestauranrs();

    Restaurant addRestaurant(Restaurant e);

    Restaurant updateRestaurant(Restaurant e);

    Restaurant retrieveRestaurant (Long idRestaurant);

    void removeRestaurant(Long idRestaurant);

    List<Restaurant> addRestaurants (List<Restaurant> Restaurants);
}
