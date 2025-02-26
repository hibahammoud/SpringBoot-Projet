package com.example.demo.controller;

import com.example.demo.services.IRestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class Restaurantcontroller {
    IRestaurantService restaurantService ;
}
