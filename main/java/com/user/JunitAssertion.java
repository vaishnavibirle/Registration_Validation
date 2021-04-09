package com.user;
import java.util.regex.Pattern;
public class JunitAssertion {
    public Boolean firstName(String a) {
        Boolean firstNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}$",a);
        return firstNameValidation;
    }
    public Boolean lastName(String a) {
        Boolean lastNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}$",a);
        return lastNameValidation;
    }
    public Boolean email(String c) {
        Boolean emailValidation = Pattern.matches("^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,6}",c);
        return emailValidation;
    }
    public Boolean mobileNumber (String d) {
        Boolean mobileNumberValidation = Pattern.matches("^[91]+[\\\\s]+[1-9]{1}+[0-9]{9}",d);
        return mobileNumberValidation;
    }
    public Boolean passwordRule1 (String e) {
        Boolean passwordRule1Validation = Pattern.matches("^(?=.*?[A-Z])(?=.*?[0-9]).{8,}$",e);
        return passwordRule1Validation;
    }
    public Boolean passwordRule2 (String f) {
        Boolean passwordRule2Validation = Pattern.matches("^(?=.*[A-Z]).{8,20}$",f);
        return passwordRule2Validation;
    }
    public Boolean passwordRule3 (String g) {
        Boolean passwordRule3Validation = Pattern.matches("^(?=.*[A-Z]).{8,20}$",g);
        return passwordRule3Validation;
    }
}
