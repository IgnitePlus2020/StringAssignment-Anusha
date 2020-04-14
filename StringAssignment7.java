package com.tgt.igniteplus;
//To remove hyphen between two digits
public class StringAssignment7 {
    public static void main(String[] args) {
        String s = "134-10/5566 A-block, Manyata Tech-Park";
        System.out.println("Given string: \n"+s);
        String a = "";
        char ch = '-';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch && i!=0 && i!=s.length()-1 && (int)s.charAt(i-1)>=48 && (int)s.charAt(i-1)<=57 && (int)s.charAt(i+1)>=48 && (int)s.charAt(i+1)<=57)
                continue;
            a = a.concat(String.valueOf(s.charAt(i)));
        }
        System.out.println("String after removing - between 2 digits is \n"+a);
    }
}


