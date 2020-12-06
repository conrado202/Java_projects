package com.javafortesters.chap008.selectionanddecisions.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IfHttp {

    @Test
    public void ifAddHttp(){
        String url = "www.seleniumsimplified.com";

        if(url.startsWith("http")){

        }
        else{
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    private String addHttp(String url){
        return "http://" + url;
    }


}
