package com.javafortesters.chap009.arrays.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayHundredUsers {

    @Test
    public void assertUsers(){

        String[] userdata = new String[101];

        for(int i=1; i<userdata.length; i++) {
            userdata[i] = ("User" + i + " -> Password" + i);
            System.out.println(userdata[i]);
        }

        assertEquals("User1 -> Password1", userdata[1]);
    }
}
