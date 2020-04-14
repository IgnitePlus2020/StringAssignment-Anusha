package com.tgt.igniteplus;

import java.util.Scanner;

//to check if a string is empty
public class StringAssignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = sc.nextLine();
        if(a.isEmpty())
            System.out.println("empty string");
        else
            System.out.println("Not an empty string");
    }
}
