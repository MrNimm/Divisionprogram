package com.maxwell;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {

    /*  Program output must not exceed two decimal places.
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

        //Randomize two numbers w 2 Decimal
        double number1 = (double) (Math.random() * 100);
        Double number2 = (double)(Math.random() * 25);

        //Format those bad boys
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        DecimalFormat decimalFormat = (DecimalFormat)numberFormat;
        decimalFormat.applyPattern("000.##");

        //Ensure numbers are generated
        System.out.println("Numbers generated: ");
        System.out.println(decimalFormat.format(number1));
        System.out.println(decimalFormat.format(number2));

        //Ensure No zero is given
        if (number1 == 0) {
            System.out.println("The universe imploded... generating non-zero number");
        }
        if (number2 == 0) {
            System.out.println("The universe imploded... generating non-zero number");
        }

        //Divide the smaller into the larger

           







    }
}