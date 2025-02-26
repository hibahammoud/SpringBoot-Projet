package com.example.demo.controller;

import com.example.demo.services.IMenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class Menucontroller {
    IMenuService menuService ;
}
