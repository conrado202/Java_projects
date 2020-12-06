package com.javafortesters.chap013junit.examples;

import com.javafortesters.chap012.inheritance.examples.UserConstructor;
import com.javafortesters.domaintitles.User;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Rules {

    @Rule
    public ExpectedException expected = ExpectedException.none();
/*
    @Test
    public void invalidPasswordThrown()
                        throws InvalidPassword {
        expected.expect(InvalidPassword.class);
        User user = new User("username", "<6");
    }*/


}
