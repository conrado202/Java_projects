package com.javafortesters.chap013junit.examples;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.core.Is.is;

public class Hamcrest {

    @Test
    public void addNumber(){
        int sum = 2+3;
        Assert.assertThat("2+3=5", 5, is(sum));
    }

    @Test
    public void zacznijOd(){
        String word = "Hakunamatata";
        Assert.assertThat(word.toLowerCase(), startsWith("h"));
    }


}
