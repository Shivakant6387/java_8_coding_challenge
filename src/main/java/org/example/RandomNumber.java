package org.example;

import java.util.Random;

//Q2). Java 8 Program to Print ten random numbers using forEach?
public class RandomNumber {
    public static void main(String[] args) {
        Random random=new Random();
        random.ints().limit(10).forEach(System.out::println);
    }
}
