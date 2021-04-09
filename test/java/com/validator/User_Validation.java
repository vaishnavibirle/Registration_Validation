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
}
