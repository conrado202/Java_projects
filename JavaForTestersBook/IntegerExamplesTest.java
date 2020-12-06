package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
        Integer four = new Integer(4);
        Integer five = new Integer("5");

        assertEquals("intValue returns 4", 4, four.intValue());
        assertEquals("intValue returns 5", 5, five.intValue());
    }

    @Test
    public void integerToHex(){

        assertEquals("toHexString of 11 returns b", "b", Integer.toHexString(11));
        assertEquals("toHexString of 10 returns b", "a", Integer.toHexString(10));
        assertEquals("toHexString of 3 returns 3", "3", Integer.toHexString(3));
        assertEquals("toHexString of 21 returns 15", "15", Integer.toHexString(21));
    }
}
