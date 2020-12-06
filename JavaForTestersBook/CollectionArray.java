package com.javafortesters.chap010_collection_examples;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CollectionArray {

    @Test
    public void simpleCollectionExample(){
        String[] numbers0123Array = {"zero", "one", "two", "three"};
        List<String> numbers0123 = Arrays.asList(numbers0123Array);

        //List<String> numbers0123 = new ArrayList<String>();

        for(String numberText : numbers0123){
            System.out.println(numberText);
        }

        assertEquals("zero", numbers0123.get(0));
        assertEquals("one", numbers0123.get(1));
    }
}
