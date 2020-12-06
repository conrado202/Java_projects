package com.javafortesters.chap013junit.examples;

import org.junit.*;

import static org.hamcrest.core.Is.is;

public class AfterBefore {

    /*@BeforeClass
    public static void tunOncePerClassBeforeAnyTest(){
        System.out.println("@BeforeClass method");
    }

    @AfterClass
    public static void runOncePerClassAfterAnyTest(){
        System.out.println("@AfterClass method");
    }

    @Before
    public void runBeforeEveryTestMethod(){
        System.out.println("@Before each method");
    }*/

    //@Ignore
    @Test
    public void addNumbers(){
        int a = 4;
        int b = 3;

        Assert.assertEquals(7, a+b);
        Assert.assertThat("3 + 3 = 6", 3 + 3, is(6));

    }


}
