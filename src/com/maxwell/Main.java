package com.maxwell;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {

        //Display Welcome Msg purpose and reminder txt
        System.out.println("Welcome to the Division Quiz Program");
        System.out.println("This program will generate a division quiz with random numbers");
        System.out.println("Please note: You may need to round your answer if using integers and only two decimal places");

        //Randomize two numbers w 2 Decimal and DEALING WITH ZERO
        double number1 = (double) (Math.random() * 100);
            if (number1 == 0) {
                System.out.println("The universe imploded... generating non-zero number"); }
                    else {}
        Double number2 = (double) (Math.random() * 25);
            if (number2 == 0) {
                System.out.println("The universe imploded... generating non-zero number");}
                    else {}

        //Format those bad boys
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        decimalFormat.applyPattern("000.##");

        //Ensure numbers are generated
        System.out.println("Numbers generated: ");
        System.out.println(decimalFormat.format(number1));
        System.out.println(decimalFormat.format(number2));



        }
    }