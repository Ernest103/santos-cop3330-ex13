package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        double initAmount, finalAmount, rate;
        int years, rateComp;

        System.out.print("What is the principal amount? ");
        initAmount = sc.nextDouble();
        System.out.print("What is the interest rate ");
        rate = sc.nextDouble();
        System.out.print("Enter the number of years ");
        years = sc.nextInt();
        System.out.print("What is the number of times the interest is compounded " +
                "per year? ");
        rateComp = sc.nextInt();

        finalAmount = interestGain(initAmount, rate, years, rateComp);

        System.out.printf("$%.2f invested at %.1f%% for %d years compounded %d times " +
                "per year is $%.2f", initAmount, rate, years, rateComp, finalAmount);

    }

    private static double interestGain(double amount, double rate, int years, int n){
        rate = rate/100;
        double base = (1 + (rate / n));
        int pw = n * years;

        return amount * Math.pow(base, pw);
    }
}
