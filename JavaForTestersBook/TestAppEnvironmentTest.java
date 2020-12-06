package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){
        assertEquals("Return hardcodeddomain", "192.123.0.3", TestAppEnv.DOMAIN);
        assertEquals("Return hardcodedport", "67", TestAppEnv.PORT);
        assertEquals("Return hardcodedurl", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }

    /*public static String name(){
        return "http://" + TestAppEnv.DOMAIN + ":" + TestAppEnv.PORT;
    }*/
/*
    @Test
    public void canGetUrlStatically(){
        assertEquals("Return hardcodedurl", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }*/

}
