package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Q8) Java 8 program to multiply 3 to all elements in the list and print the list?
public class Multiply3 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(integerList.stream().map(i -> i*3).collect(Collectors.toList()));
    }
}
