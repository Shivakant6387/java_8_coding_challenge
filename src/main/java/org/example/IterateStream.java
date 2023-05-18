package org.example;

import java.util.Arrays;
import java.util.List;

//Q3). Java 8 program to iterate a Stream using the forEach method?
public class IterateStream {
    public static void main(String[] args) {
        List<String>stringList= Arrays.asList("Hello","Interview","Question","Answer");
        stringList.stream().forEach(System.out::println);
    }
}
