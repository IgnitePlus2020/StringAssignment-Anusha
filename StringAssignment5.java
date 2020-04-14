package com.tgt.igniteplus;

import java.util.Scanner;

//to determine length or size of a string
public class StringAssignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = sc.nextLine();
        System.out.printf("Length of the string is "+a.length());
    }
}
