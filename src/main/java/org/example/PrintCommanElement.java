package org.example;

import java.util.HashSet;
import java.util.Set;

public class PrintCommanElement {
    public static void main(String[] args) {
        int arr1[]={80,10,15,2,35,60};
        int arr2[]={35,80,60,20,75};
        printInterSection(arr1,arr2);
        printUnion(arr1,arr2);
    }
    public static void printUnion(int arr1[],int arr2[]){
        Set<Integer>set=new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("Union");
        System.out.println(set);
    }
    public static void printInterSection(int arr1[],int arr2[]){
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int j=0;j<arr2.length;j++){
         if (set.contains(arr2[j])){
             System.out.println(arr2[j]+" ");
         }
        }
    }
}
