package exercise05;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 1
 *  Copyright 2021 Dustin Battles
 */

/*
 * In this one we're demonstrating the computer's 4 type calculating functions
 * First, we'll ask for 2 numbers
 * First add em
 * Second subtract two from one
 * Multiply em
 * Divide one by two
 */

public class solution05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0 , num2 = 0, i = 1;

        while(i == 1)
        {
            System.out.println("Let's talk numbers. Which one would you like?");
            num1 = input.nextInt();
            System.out.println("Give me another!");
            num2 = input.nextInt();
            if(num1 < 0 || num2 < 0)
            {
                System.out.println("Please don't insert any negative numbers.");
            }
            else
            {
                i = 0;
            }
        }

        System.out.println("Alright, let's crunch these numbers:");
        int add = (num1 + num2);
        System.out.println(num1 + " + " + num2 + " = " + add);
        int subtract = (num1 - num2);
        System.out.println(num1 + " - " + num2 + " = " + subtract);
        int multiplication = (num1 * num2);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        float divide = (num1 / num2);
        System.out.println(num1 + " / " + num2 + " = " + divide);
    }
}
