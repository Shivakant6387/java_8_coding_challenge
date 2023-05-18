package org.example;
//Q4). Java 8 program to find the Minimum number of a Stream?

import java.util.Comparator;
import java.util.stream.Stream;

public class FindMinNumberStream {
    public static void main(String[] args) {
        Integer min= Stream.of(1,2,3,4,5,6,7).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("The minimum number is :"+min);
    }
}
