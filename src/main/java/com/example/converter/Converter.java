package com.example.converter;

public class Converter {

    private double stTokg = 6.0;
    private double ouTogr = 28.0;
    public String index(){
        return "Willkommen zum Converter!";
    }

    public double kilo(double st) {
        return st * stTokg;
    }

    public Object gram(double ou) {
        return ou * ouTogr;
    }
}
