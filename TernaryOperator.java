package com.javafortesters.chap007.basicjavarevisited.examples;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TernaryOperator {

    // Ternary operator is an operator which looks like:
    // condition ? operand1 : operand2
    // If the condition is true the it returns the value of 1st operand, if it is false - returns value of 2nd operand.

    @Test
    public void ternaryOperatorExploration(){
        int x;
        x = 4>3 ? 2 : 1;
        assertEquals(2, x);

        assertTrue(5 >= 4 ? true : false);

    }


}
