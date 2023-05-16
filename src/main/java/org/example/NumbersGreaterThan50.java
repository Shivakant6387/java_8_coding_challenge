package org.example;

import java.util.Arrays;
import java.util.List;

//Q14) Java 8 program to perfrom cube on list elements and filter numbers greater than 50.
public class NumbersGreaterThan50 {
    public static void main(String[] args) {
        List<Integer>integerList= Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream().map(integer -> integer*integer*integer).filter(integer -> integer>50).forEach(System.out::println);
    }
}
