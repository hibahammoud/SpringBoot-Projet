package com.example.demo.controller;

import com.example.demo.services.IChefcuisinierService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class Chefcuisiniercontroller {
    IChefcuisinierService chefcuisinierService ;
}
