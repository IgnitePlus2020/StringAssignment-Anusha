package com.tgt.igniteplus;

import java.util.Scanner;
//to check if a string contains only digits
public class StringAssignment3 {
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        a=sc.nextLine();
        for(int i = 0; i < a.length(); i++)
        {
            int x = a.charAt(i);
            if(x < 48 || x > 57)
            {
                System.out.println("It doesn't contain only numeric values");
                return;
            }
        }
        System.out.println("String contains only numeric values");
    }
}
