package org.example;

import java.util.Arrays;
import java.util.List;

//Q12) Java 8 program to sort the given list?
public class SortArrayList {
    public static void main(String[] args) {
        List<Integer>integerList= Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream().sorted().forEach(System.out::println);
    }

}
