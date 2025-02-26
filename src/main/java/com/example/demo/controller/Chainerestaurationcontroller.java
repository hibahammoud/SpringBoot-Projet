package com.example.demo.controller;

import com.example.demo.services.IChainerestaurationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class Chainerestaurationcontroller {
    IChainerestaurationService chainerestaurationService ;
}
