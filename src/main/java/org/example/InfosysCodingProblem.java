package org.example;

import java.util.StringJoiner;

/*A,B,C
P:Q
A,B,C,P:Q
 */
public class InfosysCodingProblem {
    public static void main(String[] args) {
        StringJoiner stringJoiner=new StringJoiner(",","[","]");
        stringJoiner.add("A").add("B").add("C");
        System.out.println(stringJoiner);
        StringJoiner stringJoiner2=new StringJoiner(":");
        stringJoiner2.add("P").add("Q");
        System.out.println(stringJoiner2);
        stringJoiner.merge(stringJoiner2);
        System.out.println(stringJoiner);

    }
}
