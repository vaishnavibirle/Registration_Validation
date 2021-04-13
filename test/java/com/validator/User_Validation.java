package com.validator;

import com.user.JunitAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class User_Validation {

    //Test for firstname validation
    @Test
    void CheckFirstNameWhileCorrectReturnTrue() {
        JunitAssertion fName = new JunitAssertion();
        String ch = fName.firstName("Mouni");
        Assertions.assertEquals("HAPPY",ch);
        System.out.println(ch);
    }

    @Test
    void CheckLastnameWhileCorrectReturnTrue() {

        JunitAssertion lName = new JunitAssertion();
        String ch = lName.lastName("Roy");
        Assertions.assertEquals("HAPPY", ch);
        System.out.println(ch);
    }

    @Test
    void CheckEmailWhileCorrectReturnTrue() {

        JunitAssertion eMail = new JunitAssertion();
        String ch = eMail.email("mouniroy123@gmail.com");
        Assertions.assertEquals("HAPPY", ch);
        System.out.println(ch);
    }

    @Test
    void CheckNumberWhileCorrectReturnTrue() {

        JunitAssertion number = new JunitAssertion();
        String ch = number.phoneNumber("91 7880437890");
        Assertions.assertEquals("HAPPY", ch);
        System.out.println(ch);
    }

    @Test
    void CheckPasswordWhileCorrectReturnTrue() {
        JunitAssertion pwd = new JunitAssertion();
        String ch = pwd.password("Mouni@123");
        Assertions.assertEquals("HAPPY", ch);
        System.out.println(ch);
    }

}