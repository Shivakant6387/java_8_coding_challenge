package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Q9) Java 8 program to perform concatenation on two Streams?
public class ConcatenationOnTwoStreams {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4);
        List<Integer>list1=Arrays.asList(5,6,7);
        Stream<Integer>concatStream=Stream.concat(list.stream(),list1.stream());
        concatStream.forEach(System.out::println);
    }
}
