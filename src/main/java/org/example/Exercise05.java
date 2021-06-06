package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class Exercise05
{
    public static void main( String[] args )
    {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the first number? ");
        x = sc.nextInt();
        System.out.print("What is the second number? ");
        y = sc.nextInt();
        System.out.printf("%d + %d = %d\n", x, y, x + y);
        System.out.printf("%d - %d = %d\n", x, y, x - y);
        System.out.printf("%d * %d = %d\n", x, y, x * y);
        System.out.printf("%d / %d = %d", x, y, x / y);
    }
}
