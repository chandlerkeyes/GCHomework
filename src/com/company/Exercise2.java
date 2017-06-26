package com.company;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userInput = 0;
        int output = 0;

        System.out.println("Enter a number:");
        userInput = keyboard.nextInt();

        output = userInput + 1;

        System.out.println(output);
    }
}
