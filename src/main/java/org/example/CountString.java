package org.example;

import java.util.Arrays;
import java.util.List;

//Q6) Java 8 program to Count Strings whose length is greater than 3 in List?
public class CountString {
    public static void main(String[] args) {
        List<String>stringList= Arrays.asList("Hello","InterView","Question","Shiva","for");
            long count=stringList.stream().filter(str->str.length()>3).count();
        System.out.println("String count with greater than 3 digit:"+count);
    }
}
