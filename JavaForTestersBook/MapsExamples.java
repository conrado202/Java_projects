package com.javafortesters.chap010_collection_examples;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MapsExamples {

    // Maps are storing pairs like-> key : value
    // key must be unique and it refers to only one value
    // Maps have got methods like: size, clear, isEmpty

    @Test
    public void testingMaps(){
        Map<String, String> numberUseMap = new HashMap<>();

        numberUseMap.put("key1", "value1");
        numberUseMap.put("key2", "value2");
        numberUseMap.put("key3", "value3");

        assertEquals("value1", numberUseMap.get("key1"));
    }
}
