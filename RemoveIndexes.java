package com.javafortesters.chap010_collection_examples;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class RemoveIndexes {

    @Test
    public void removeAnElementAndAnIndex(){
        List<String> days = new ArrayList<String>();

        days.add("Monday");
        days.add("Tuesday"); //
        days.add("Wednesday");  //Saturday
        days.add("Thursday");
        days.add("Friday");

        days.remove(1);
        days.set(2, "Saturday");

        System.out.println(days.get(2));

        assertEquals(4, days.size());
        assertEquals("Monday", days.get(0));
        assertEquals("Saturday", days.get(2));

    }


}
