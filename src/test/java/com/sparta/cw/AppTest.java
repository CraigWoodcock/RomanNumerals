package com.sparta.cw;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;



public class AppTest {
    @Test
    public void checkNumeralI(){
        Assertions.assertEquals("I",App.getNumerals(1));
    }

    @Test
    public void checkNumeralIV(){
        Assertions.assertEquals("IV", App.getNumerals(4));
    }

    @Test
    public void checkNumeralV(){
        Assertions.assertEquals("V", App.getNumerals(5));

    }
    @Test
    public void checkNumeralIX(){
        Assertions.assertEquals("IX", App.getNumerals(9));

    }
    @Test
    public void checkNumeralX(){
        Assertions.assertEquals("X", App.getNumerals(10));

    }
}
