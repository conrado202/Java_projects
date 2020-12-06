package com.javafortesters.chap007.basicjavarevisited.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UnicodeChars {

    @Test
    public void isUnicode(){
        char aChar = '\u0026';
        assertEquals('&', aChar);
    }
}
