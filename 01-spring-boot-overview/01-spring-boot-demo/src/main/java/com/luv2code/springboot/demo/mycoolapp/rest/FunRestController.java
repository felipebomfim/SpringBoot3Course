package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        return "<h1>Hello World!</h1>";
    }

}
