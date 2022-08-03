package com.bridgelabz.regex_example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLastNameCheck {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
        System.out.println("Enter last name ");
        Scanner sc = new Scanner(System.in);
        String lname = sc.nextLine();
        Matcher matcher = pattern.matcher(lname);

        if(matcher.matches() == false){
            System.out.println("Not a valid last name");
        } else {
            System.out.println("Valid last name");
        }
    }
}
