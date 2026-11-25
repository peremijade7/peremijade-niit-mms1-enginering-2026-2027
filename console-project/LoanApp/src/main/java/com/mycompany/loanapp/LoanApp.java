/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.loanapp;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LoanApp {

    public static void main(String[] args) {
        int loanAmount, loanDuration, month, monthlyPayment;
        double fixedInterest, monthlyInterest, totalMonthlyPayment;
        double totalInterest = 0, totalRepayment = 0;
        int outstandingBalance;

        Scanner inputScanner = new Scanner(System.in);

        try {
            System.out.println("===================");
            System.out.println("     LOAN APP");
            System.out.println("===================");

            System.out.println("Enter Loan Amount");
            loanAmount = inputScanner.nextInt();

            System.out.println("Enter Loan Duration (in months)");
            loanDuration = inputScanner.nextInt();

            if (loanDuration < 1) {
                do {
                    System.out.println("Enter Loan Duration Between 1 and 12 months");
                    loanDuration = inputScanner.nextInt();
                } while (loanDuration < 1);
            }

            System.out.println("--------------------------------------------------------------");
            System.out.println("                    LOAN BREAKDOWN");
            System.out.println("--------------------------------------------------------------");
            fixedInterest = 1.5 / 100;

            month = 1;
            outstandingBalance = loanAmount;
            monthlyPayment = loanAmount / loanDuration;
            System.out.printf("%-8s %-18s %-18s %-18s%n",
                    "Month", "Monthly Payment", "Interest", "Total Payment");

            System.out.println("--------------------------------------------------------------");
            do {
                monthlyInterest = fixedInterest * outstandingBalance;
                totalInterest = totalInterest + monthlyInterest;

                totalMonthlyPayment = monthlyPayment + monthlyInterest;
                totalRepayment = totalRepayment + totalMonthlyPayment;
                System.out.printf("%-8d %-18d %-18.2f %-18.2f%n",
                        month, monthlyPayment, monthlyInterest, totalMonthlyPayment);
                outstandingBalance = outstandingBalance - monthlyPayment;
                month++;

            } while (month <= loanDuration);

            System.out.println("--------------------------------------------------------------");
            System.out.println("                   LOAN SUMMARY");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Loan Amount: #" + loanAmount);
            System.out.println("Borrowed for " + loanDuration + "month");
            System.out.printf("Total Interest: #%.2f%n", totalInterest);
            System.out.printf("Total Repayment: #%.2f%n", totalRepayment);
        } catch (Exception e) {
            System.out.println("Invalid Loan Amount/Loan Duration");
        }
    }
}
