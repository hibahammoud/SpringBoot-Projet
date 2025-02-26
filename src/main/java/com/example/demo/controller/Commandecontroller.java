package com.example.demo.controller;

import com.example.demo.services.ICommandeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class Commandecontroller {
    ICommandeService commandeService ;
}
