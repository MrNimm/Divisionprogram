package com.maxwell;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    /*  The Program will randomize two numbers.
        Generated large random number is 0-100 and smaller random number is 0-25.
        Program output must not exceed two decimal places.
        Program will divide the smallest random number into the largest random number for an answer.
        Divide by zero is of course not allowed and checked for if necessary.
        Program will show the user the question with small and large random numbers previously generated.
        The user will input their answer and hit return.
        Program will inform the user if their answer was correct or not and display the full problem and answer if they are incorrect.
        If user is correct the output will show “You are correct!”
        The program will then say “Good Bye!” and terminate.*/

        //Create Scanner

        //Display Welcome Msg
        System.out.println("Welcome to the Division Quiz Program");

        //Display Program Purpose
        System.out.println("This program will generate a division quiz with random numbers");

        //Display reminder txt
        System.out.println("Please note: You may need to round your answer if using integers and only two decimal places");

        //Randomize two numbers
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 25);
            System.out.println("Your first number is: " + number1);
            System.out.println("Your second number is: " + number2);





    }
}