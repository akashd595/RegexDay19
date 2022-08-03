package com.bridgelabz.regex_example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerification {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^([a-zA-Z\\.]+)([a-zA-Z0-9\\.]+)@([a-zA-Z0-9\\._]+)\\.([a-z]{2,8})(\\.[a-z]{2,8})?$");
        System.out.println("Please enter emial Id");
        Scanner sc = new Scanner(System.in);
        String emailCheck = sc.nextLine();
        Matcher matcher = pattern.matcher(emailCheck);

        if(matcher.matches() == false) {
            System.out.println("Not a valid email address");
        } else {
            System.out.println("your email id is okay");
        }
    }
}
