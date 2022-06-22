package com.example.converter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    private Converter conv = new Converter();
    @RequestMapping("/")
    public String index(){
        return conv.index();
    }

    @RequestMapping("/kilo")
    public String kilo(@RequestParam double st){
        return String.format("%f Stone/s sind %f Kilo/s",st,conv.kilo(st));
    }

    @RequestMapping("/gram")
    public String gram(@RequestParam double ou){
        return String.format("%f Ounce/s sind %f Gramm",ou,conv.gram(ou));
    }
}
