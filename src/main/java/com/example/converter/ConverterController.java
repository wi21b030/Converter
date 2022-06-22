package com.example.converter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    @RequestMapping("/")
    public String index(){
        return "Wilkommen zum Converter!";
    }
}
