package com.javafortesters.chap012.inheritance.examples;

import com.javafortesters.domaintitles.User;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserConstructor {

  /*  public User(){
        this("username", "password", false);
    }

    private User(String username, String password, boolean b){
        this.username = username;

        try{
            setPassword(password);
        } catch(InvalidPassword e){
            throw new IllegalArgumentException("Default password incorrect ", e);
        }
    }*/

    @Test
    public void canCreateDefultUserWithoutException(){
        User aUser = new User();
        assertEquals("username", aUser.getUserName());
        assertEquals("password", aUser.getPassword());
    }

   /* @Test
    public void haveToCatchIllegalPassword(){
        try{
            User aUser = new User("me","wrong");
            fail("An exception should have been thrown");
        } catch (InvalidPassword invalidPassword){
            assertTrue("The exception was thrown", true);
        }*/
    }

   /* public class InvalidPassword extends Exception{
        public InvalidPassword(String message){
            super(message);
        }
    }
} */
