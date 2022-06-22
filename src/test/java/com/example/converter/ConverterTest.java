package com.example.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    private Converter cv = new Converter();

    @Test
    void indexTest(){
        String a = cv.index();
        String exp = "Willkommen zum Converter!";
        assertEquals(exp,a);
    }

    @Test
    void kiloTest(){
        double toConvert = 5.0;
        double result = cv.kilo(toConvert);
        double exp = 30.0;
        assertEquals(exp,result);
    }

    @Test
    void gramTest(){
        double toConvert = 2.0;
        double result = cv.gram(toConvert);
        double exp = 56.0;
        assertEquals(exp,result);
    }


}