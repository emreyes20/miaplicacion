package com.cursoluv2code.springboot.demo.miaplicacion.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Se expone un endpoint "/" que retorna un 'Hola Mundo'

    @GetMapping("/")
    public String sayHello(){
        return "Hola Mundo!";
    }
}
