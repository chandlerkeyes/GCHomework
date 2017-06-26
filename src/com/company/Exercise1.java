package com.company;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput = " ";

        System.out.println("Enter a line of text:");
        userInput = keyboard.nextLine();

        System.out.println(userInput);
    }
}
