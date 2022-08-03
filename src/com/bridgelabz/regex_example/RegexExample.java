package com.bridgelabz.regex_example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^([A-Z]{1}+)[A-Za-z]{2,}$");
        System.out.println("Enter name ");
        Scanner sc = new Scanner(System.in);
        String fname = sc.nextLine();
        Matcher matcher = pattern.matcher(fname);

        if(matcher.matches() == false){
            System.out.println("Does not matches the convention ");
        }else {
            System.out.println("Follows ");
        }
    }
}
