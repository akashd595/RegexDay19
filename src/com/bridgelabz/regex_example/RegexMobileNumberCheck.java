package com.bridgelabz.regex_example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMobileNumberCheck {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z]).{8,}$");
        System.out.println("Please enter password minimum 8 character");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches() == false) {
            System.out.println("Not a valid mobile number");
        } else {
            System.out.println("your mobile number is okay");
        }
    }
}

