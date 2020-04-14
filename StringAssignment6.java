package com.tgt.igniteplus;
//different ways to compare two strings
public class StringAssignment6 {
    public static void main(String[] args) {
        String a = "hi";
        String b = "hi";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(a==b);
        System.out.println(a.compareTo(b));
    }
}
