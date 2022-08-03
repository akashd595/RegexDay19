package com.bridgelabz.regex_example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMobileNumber {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^([0-9]{2}+)[ ]([6-9]{1,1}+)([0-9]{9,9})$");
        System.out.println("Please enter mobile number");
        Scanner sc = new Scanner(System.in);
        String mobileNumberCheck = sc.nextLine();
        Matcher matcher = pattern.matcher(mobileNumberCheck);

        if(matcher.matches() == false) {
            System.out.println("Not a valid mobile number");
        } else {
            System.out.println("your mobile number is okay");
        }
    }
}
