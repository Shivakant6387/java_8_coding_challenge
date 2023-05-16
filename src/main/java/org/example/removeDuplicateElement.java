package org.example;
//Q10) Java 8 program to remove the duplicate elements from the list?
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicateElement {
    public static void main(String[] args) {
        List<Integer>integerList= Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8);
        System.out.println("After removing duplicates");
        integerList.stream().sorted().collect(Collectors.toSet()).forEach(System.out::println);
    }
}
