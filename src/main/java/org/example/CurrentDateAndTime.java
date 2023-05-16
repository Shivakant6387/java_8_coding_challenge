package org.example;

public class CurrentDateAndTime {
    public static void main(String[] args) {
        System.out.println("Current Date: " + java.time.LocalDate.now());
        System.out.println("Current Time: " + java.time.LocalTime.now());
        System.out.println("Current Date and Time: " + java.time.LocalDateTime.now());
    }
}