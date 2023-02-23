package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex
{
    public static void main(String[] args) {
// Regular Pattern
// Pattern -> pattern to be apply
// Matcher -> actual String

// 9878787878 -> Valid
// 0123456789 -> invalid
// asc123456789 -> invalid
// 919878787878 -> valid
// +919878787878 -> valid
// 123456 -> Valid
// 12345 -> Invalid
// 4567899 -> invalid
// +, *, ?
        Pattern pattern = Pattern.compile("^[^a-zA-Z0-9]?$");
        Matcher matcher = pattern.matcher("A");
        System.out.println(matcher.find());

// Pin Number
/**
 * only number
 * 6 digit
 * start with -> 1 - 9
 */
        pattern = Pattern.compile("^[1-9][0-9]{5}$");
        matcher = pattern.matcher("0234561");
        System.out.println("Pin : " + matcher.find());

// Ques.: Name 3,
/**
 * 1. Capital
 * 2. small
 * 3. min 3
 */
        pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        matcher = pattern.matcher("rushikeshmule@manlitics.com");
        System.out.println("mail Id : " + matcher.find());

        matcher = pattern.matcher("rushikeshmulemanlitics.com");
        System.out.println("Mail Id : " + matcher.find());


        pattern = Pattern.compile("^[0-9]{10}$");
        matcher = pattern.matcher("9370121886");
        System.out.println("Number : " + matcher.find());



    }
}

