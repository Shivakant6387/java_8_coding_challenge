//Q5). Java 8 program to find the Maximum number of a Stream?
package org.example;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindMuxNumber {
    public static void main(String[] args) {
        Integer max= Stream.of(1,2,3,4,5,6,7,8,9,99).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Find the maximum number:"+max);
    }
}
