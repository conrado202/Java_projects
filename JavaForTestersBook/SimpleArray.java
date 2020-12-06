package com.javafortesters.chap009.arrays.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SimpleArray {

    @Test
    public void simpleArrayTest(){
        String[] numbers0123 = {"zero", "one", "two", "three"};

        for(String numberText : numbers0123){       // This statement 'variable : arrayName' iterates the loop
                                                    // through each item in the array
            System.out.println(numberText);
        }

        assertEquals("zero", numbers0123[0]);
        assertEquals("three", numbers0123[3]);
    }

    @Test
    public void daysTest(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String days = "";

        //for(String workday : workdays){
          for(int i=0; i<5; i++){
              //days = days + "|" + workday;
              days = days + "|" + workdays[i];
        }

        System.out.println(days);
        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }
}
