package com.javafortesters.chap007.basicjavarevisited.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BitShift {

    @Test
    public void bitWiseShiftOperator(){
        int x = 56;

        assertEquals(x*2, x<<1);
        assertEquals(x*4, x<<2);
        assertEquals(x*8, x<<3);

        x <<=3;
        assertEquals(56*8, x);

        x=Integer.MAX_VALUE;
        assertEquals(Integer.MAX_VALUE/2, x>>1);
        assertEquals(Integer.MAX_VALUE/4, x>>2);

        x = Integer.MIN_VALUE;
        assertEquals((Integer.MAX_VALUE/2)+1, x>>>1);
    }

}

