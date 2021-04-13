package com.user;

import java.util.regex.Pattern;

public class JunitAssertion {

    public Boolean firstName(String firstname) {
        Boolean firstNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstname);
        return firstNameValidation;
    }

    public Boolean lastName(String lastname) {
        Boolean lastNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastname);
        return lastNameValidation;
    }

    public Boolean email(String email_id) {
        Boolean emailValidation = Pattern.matches("^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,6}", email_id);
        return emailValidation;
    }

    public Boolean mobileNumber(String number) {
        Boolean mobileNumberValidation = Pattern.matches("^[91]+[\\\\s]+[1-9]{1}+[0-9]{9}", number);
        return mobileNumberValidation;
    }

    public Boolean passwordRule1(String pass1) {
        Boolean passwordRule1Validation = Pattern.matches("^(?=.*?[A-Z])(?=.*?[0-9]).{8,}$", pass1);
        return passwordRule1Validation;
    }

    public Boolean passwordRule2(String pass2) {
        Boolean passwordRule2Validation = Pattern.matches("^(?=.*[A-Z]).{8,20}$", pass2);
        return passwordRule2Validation;
    }

    public Boolean passwordRule3(String pass3) {
        Boolean passwordRule3Validation = Pattern.matches("^(?=.*[A-Z]).{8,20}$", pass3);
        return passwordRule3Validation;
    }

    public Boolean passwordRule4(String pass4) {
        Boolean passwordRule4Validation = Pattern.matches("^(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$", pass4);
        return passwordRule4Validation;
    }

    public Boolean emailSamples(String emailsamples) {
        Boolean emailValidation = Pattern.matches("^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,6}", emailsamples);
        //Boolean emailValidation = Pattern.matches("^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@\" + \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$",b);
        return emailValidation;
    }
}
