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
        System.out.println("How much do you get paid per hour?");
        double payRate = myScanner.nextDouble();
        double grossPay = payRate * hoursWorked;

        //Output gross pay
        //if employee works over 40 hours, their pay increases by 1.5x
        //if not, they get their normal pay
        //Also formatted to only print out 2 decimal places
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            double overtimeGrossPay = (payRate * 40) + (overtimeHours * payRate * 1.5);

            System.out.println("Overtime gross pay is: $" + String.format("%.2f", overtimeGrossPay));
        }
        else {
            System.out.println("Gross pay: $" + String.format("%.2f", grossPay));
        }

    }
}
