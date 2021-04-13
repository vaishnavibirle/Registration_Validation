package com.user;

import java.util.regex.Pattern;

public class JunitAssertion {

    //If conditions comes true it will print HAPPY otherwise SAD

    //Validating first name
    public String firstName(String fName) {
        Boolean firstNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}$",fName); //regex condition for firstname
        if(firstNameValidation == true)
            return "HAPPY";
        else
            return "SAD";
    }

    //validating last name
    public String lastName(String lName) {
        Boolean lastNameValidation = Pattern.matches("^[A-Z]{1}[a-z]{2,}$",lName);
        if(lastNameValidation == true)
            return "HAPPY";
        else
            return "SAD";
    }

    //validating Email with all samples
    public String email(String eMail) {
        Boolean emailValidation = Pattern.matches("^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.\\\\-]+\\\\.[A-Za-z]{2,6}",eMail);
        if(emailValidation == true)
            return "HAPPY";
        else
            return "SAD";
    }

    //validating phone number
    public String phoneNumber(String number) {
        Boolean phoneNumberValidation = Pattern.matches("^[91]+[\\\\s]+[0-9]{10}",number);
        if(phoneNumberValidation == true)
            return "HAPPY";
        else
            return "SAD";
    }

    //validating password where all rules pass
    public  String password(String pwd) {
        Boolean passwordValidation = Pattern.matches("[A-Za-z0-9]*[^A-Za-z0-9]{1}[A-Za-z0-9]*",pwd);
        if(passwordValidation == true)
            return "HAPPY";
        else
            return "SAD";
    }
}