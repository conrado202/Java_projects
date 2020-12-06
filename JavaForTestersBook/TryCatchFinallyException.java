package com.javafortesters.chap011_exceptions_examples;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class TryCatchFinallyException {

    @Test
    public void tryCatchFinallyNullPointerException(){
        Integer age = null;
        String ageAsString;
        String yourAges = "";

        try{

            ageAsString = age.toString();

        } catch (NullPointerException e){

            age = 18;
            ageAsString = age.toString();

        } finally {

            yourAges = "You are " + age.toString() + " years old.";

        }

        assertEquals("You are 18 years old.", yourAges);

    }
}
