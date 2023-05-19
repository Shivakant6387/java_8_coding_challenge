package org.example;

public class TCS {
    //to find the rotation
    public static void main(String[] args) {
        String str="ABCD";
        String str2="CDAB";
        if (isRotation(str,str2)){
            System.out.println("Rotation is present");
        }
        else {
            System.out.println("Rotation is not print");
        }

    }
    public static boolean isRotation(String str1,String str2){
        return (str1.length()==str2.length())&&((str1+str1).indexOf(str2)!=-1);
    }
}
