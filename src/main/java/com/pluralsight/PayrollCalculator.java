package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        //Create new scanner
        Scanner myScanner = new Scanner(System.in);

        //Ask for name
        System.out.println("Enter your name: ");

        String userName = myScanner.nextLine();

        //Output employee name
        System.out.println("Employee name: " + userName);

        //Ask for hours worked
        System.out.println("How many hours have you worked?");

        double hoursWorked = myScanner.nextDouble();

        //Output hours worked
        System.out.println("Hours worked: " + hoursWorked);

        //Pay rate is pay rate multiplied by hours worked
        double payRate = myScanner.nextDouble();
        double payRatePerHour = payRate * hoursWorked;

        //Output gross pay
        System.out.println("Gross pay: $" + payRatePerHour);

        if (hoursWorked > 40) {
            payRate *= 1.5;
            payRatePerHour = payRate * hoursWorked;

            System.out.println("Overtime gross pay is: $" + payRatePerHour);
        }

    }
}
