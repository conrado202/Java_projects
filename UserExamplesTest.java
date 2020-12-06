package com.javafortesters.chap012.inheritance.examples;
import com.javafortesters.domaintitles.AdminUser;
import com.javafortesters.domaintitles.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class UserExamplesTest {

    @Test
    public void aUserHasNormalPermissions(){
        User aUser = new User();
        assertEquals("Normal", aUser.getPermission());

        AdminUser anAdminUser = new AdminUser();
        assertEquals("adminuser", anAdminUser.getUserName());
        assertEquals("password", anAdminUser.getPassword());
        assertEquals("Elevated", anAdminUser.getPermission());
    }

}
