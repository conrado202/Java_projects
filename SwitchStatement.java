package com.javafortesters.chap008.selectionanddecisions.examples;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class SwitchStatement {

    @Test
    public void switchExample(){
        assertEquals("M", likelyGenderIs("mrs"));
    }

    public String likelyGenderIs(String title) {
        String likelyGender;

        switch (title.toLowerCase()){
            case "sir":
                likelyGender = "M";
                break;

            case "mr":
                likelyGender = "M";
                break;

            case "mrs":
                likelyGender = "M";
                break;

            case "master":
                likelyGender = "M";
                break;

            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
    }
}
