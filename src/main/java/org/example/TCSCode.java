package org.example;

public class TCSCode {
    public static void main(String[] args) {
        String str="Shivakant#@!$";
        int count=0;
        String removeSpecialCharacters="";
        for (int i=0;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i))&& !Character.isLetter(str.charAt(i))&&Character.isWhitespace(i)){
                count++;
            }
            else {
                removeSpecialCharacters=removeSpecialCharacters+str.charAt(i);
            }
        }
        if (count==0){
            System.out.println("There is no special characters in String");
        }
        else {
            System.out.println("Special characters found:"+count);
        }
        System.out.println("Remove Specials :"+removeSpecialCharacters);
    }
}
