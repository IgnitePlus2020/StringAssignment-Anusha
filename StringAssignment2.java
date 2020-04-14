package com.tgt.igniteplus;
import java.lang.*;
//To remove all occurrences of a given character in a sample string
public class StringAssignment2 {
    public static void main(String[] args) {
        String s = "To test this string";
        s = s.toLowerCase();
        String a = "";
        char ch = 't';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
                continue;
            a = a.concat(String.valueOf(s.charAt(i)));
        }
        System.out.println(a);
    }
}
