package com.javafortesters.chap007.basicjavarevisited.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringConcatenated {

    @Test
    public void inStringConcatenated(){
        assertEquals("12345", "12" + "34" + "5");
    }

    @Test
    public void isStringMethods(){
        String astring = "abcdef";

        // IMPORTANT! String indexing begins with 0!

        assertEquals(6, astring.length());
        assertTrue(astring.compareToIgnoreCase("ABCDEF") == 0);
        assertTrue(astring.contains("bcde"));
        assertTrue(astring.startsWith("abc"));

        assertEquals('c', astring.charAt(2));
        assertEquals("ef", astring.substring(4));

    }
}
