package org.example;

import java.util.StringJoiner;

//Q1). Java 8 Program to add prefix and suffix to the String?
public class PrefixAndSuffix {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",", "#", "#");
        stringJoiner.add("Interview");
        stringJoiner.add("Questions");
        stringJoiner.add("Answers");
        System.out.println("String after adding # in suffix and prefix :");
        System.out.println(stringJoiner);
    }
}
