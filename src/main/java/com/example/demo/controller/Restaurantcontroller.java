package com.example.demo.controller;

import com.example.demo.entities.Client;
import com.example.demo.entities.Restaurant;
import com.example.demo.services.IRestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/restaurant")
public class Restaurantcontroller {
    IRestaurantService restaurantService ;
    @GetMapping("/retrieve-all-restaurants")
    public List<Restaurant> getRestaurants() {
        List<Restaurant> list = restaurantService.retrieveAllRestauranrs();
        return list;
    }}
