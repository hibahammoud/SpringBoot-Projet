package com.example.demo.controller;

import com.example.demo.services.IComposantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class Composantcontroller {
    IComposantService composantService ;
}
