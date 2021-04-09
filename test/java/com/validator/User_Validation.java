package com.validator;

import com.user.JunitAssertion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class User_Validation {
    @Test
    void Check_Firstname_WhileCorrect_Return_True() {

        JunitAssertion fName = new JunitAssertion();
        Boolean ch = fName.firstName("Mouni");
        Assertions.assertTrue(ch);
        System.out.println(ch);
    }
    @Test
    void Check_Lastname_WhileCorrect_Return_True() {

        JunitAssertion lName = new JunitAssertion();
        Boolean ch = lName.lastName("Roy");
        Assertions.assertTrue(ch);
        System.out.println(ch);
    }
    @Test
    void Check_Email_WhileCorrect_Return_True() {

        JunitAssertion email = new JunitAssertion();
        Boolean ch = email.email("Mouni.Roy@gmail.com");
        Assertions.assertTrue(ch);
        System.out.println(ch);
    }
    @Test
    void Check_MobileNumber_WhileCorrect_Return_True() {

        JunitAssertion number = new JunitAssertion();
        Boolean ch = number.mobileNumber("91 7880437890");
        Assertions.assertTrue(ch);
    }
    @Test
    void Check_Rule1_WhileCorrect_Return_True() {
        JunitAssertion password = new JunitAssertion();
        Boolean ch = password.passwordRule1("Mouni1998");
        Assertions.assertTrue(ch);
        System.out.println(ch);
    }
    @Test
    void Check_Rule2_WhileCorrect_Return_True() {
        JunitAssertion password = new JunitAssertion();
        Boolean ch = password.passwordRule2("Ashiythi");
        Assertions.assertTrue(ch);
        System.out.println(ch);
    }


}
