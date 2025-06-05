package com.example.datefinder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {
    
    @GetMapping("/")
    public String method(){
        LocalDate today = LocalDate.now();
        LocalDate addDays = today.plusDays(100);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return addDays.format(formatter);
        
    }
}
