package com.javafortesters.chap011_exceptions_examples;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class throwNullPointerException {

    @Test
    public void nullPointerException(){
        //Integer age = null;
        //String ageAsString = age.toString();

        Integer age = null;
        String ageAsString;

        try{
            ageAsString = age.toString();
        } catch (NullPointerException e){
            age = 20;
            ageAsString = age.toString();
        }

        String yourAge = "You are " + ageAsString + " years old.";

        assertEquals("You are 20 years old.", yourAge);
    }
}
