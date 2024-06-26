package br.com.bradesco.javatemplate.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
