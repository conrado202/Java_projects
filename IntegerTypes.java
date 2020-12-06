package com.javafortesters.chap007.basicjavarevisited.examples;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class IntegerTypes {

    @Test
    public void IntTest(){
        byte aByteHas1Byte;
        short aShortHas2Bytes;
        int aIntHas4Bytes;
        long aLongHas8Bytes;

        System.out.println("* 'byte' range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("* 'short' range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("* 'int' range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("* 'long' range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        aByteHas1Byte = 0b0010;     // add '0b' for Bytes
        assertEquals(aByteHas1Byte, 2);

        aIntHas4Bytes = 010;        // add 'zero' prefix for Octal
        assertEquals(8, aIntHas4Bytes);

        aLongHas8Bytes = 0L;        // add 'L' for long int
        assertEquals(0, aLongHas8Bytes);

        aLongHas8Bytes = 9_000_000_000L;        // add 'L' for long int
                                                // Java allows underscore for better readability
        assertEquals(9000000000L, aLongHas8Bytes);

    }


}
