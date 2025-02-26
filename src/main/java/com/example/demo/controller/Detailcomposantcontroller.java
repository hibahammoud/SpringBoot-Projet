package com.example.demo.controller;

import com.example.demo.services.IDetailcomposantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class Detailcomposantcontroller {
    IDetailcomposantService detailcomposantService ;
}
