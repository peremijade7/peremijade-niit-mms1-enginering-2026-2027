/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.multifunctioncalculator;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MultiFunctionCalculator {

    public static void main(String[] args) {

        int op;
        Scanner inputScanner = new Scanner(System.in);
        try {
            System.out.println("==================================================");
            System.out.println("          MULTI FUNCTIONAL CALCULATOR");
            System.out.println("==================================================");
            System.out.println("Following the instruction Below");
            System.out.println("--------------------------------------------------");
            System.out.println("Press 1 to Calculate with Simple Caclculator");
            System.out.println("Press 2 to Calculate Circumference Of a Circle");
            System.out.println("Press 3 to Calculate Area Of a Circle");
            System.out.println("Press 4 to Calculate Average Of Three Numbers");
            System.out.println("Press 5 to Calculate Average Of Four Numbers");
            System.out.println("Press 6 to Calculate Average Of Five Numbers");
            System.out.println("Press 7 to Calculate Price Of Fifty Mangoes");
            System.out.println("Press 8 to Calculate 5% Reduction of Staff Salary");
            System.out.println("Press 9 to Calculate Simple Interest");
            System.out.println("Press 10 to Calculate Highest Of Three Numbers");
            System.out.println("Press 11 to Calculate Highest Of Four Numbers");
            System.out.println("Press 12 to Calculate Highest Of Five Numbers");
            System.out.println("Press 13 to Calculate 2 x 2 Matrix Determinant");
            System.out.println("Press 14 to Calculate 3 x 3 Matrix Determinant");
            System.out.println("Press 15 to Calculate 4 x 4 Matric Determinant");
            System.out.println("Press 16 to Calculate Quadratic Equation");
            System.out.println("Press 17 to Calculate Velocity");
            System.out.println("Press 18 to Calculate Boyle's Law");
            System.out.println("Press 19 to Calculate Loan App");
            System.out.println("==================================================");
            System.out.print("PICK AN OPTION FROM THE LIST ABOVE: ");
            op = inputScanner.nextInt();
            System.out.println("==================================================");

            if (op == 1) {
                double firstNumber, secondNumber, result;
                int operator;
                System.out.println("SIMPLE CALCULATOR");

                System.out.println("Enter First Number");
                firstNumber = inputScanner.nextDouble();

                System.out.println("Following the instruction Below");
                System.out.println("Press 1 to Calculate Sum (+)");
                System.out.println("Press 2 to Calculate Difference (-)");
                System.out.println("Press 3 to Calculate Product (X)");
                System.out.println("Press 4 to Calculate Fraction (/)");
                operator = inputScanner.nextInt();

                System.out.println("Enter value for Second Number");
                secondNumber = inputScanner.nextDouble();

                if (operator == 1) {
                    result = firstNumber + secondNumber;
                    System.out.println("Result for sum is " + result);
                } else if (operator == 2) {
                    result = firstNumber - secondNumber;
                    System.out.println("Result for Difference is " + result);
                } else if (operator == 3) {
                    result = firstNumber * secondNumber;
                    System.out.println("Result for Product is " + result);
                } else if (operator == 4) {
                    if (secondNumber == 0) {
                        System.out.println("ERROR! Cannot divide by zero");
                    } else {
                        result = firstNumber / secondNumber;
                        System.out.println("Result for Division is " + result);
                    }
                } else {
                    System.out.println("ERROR! Invalid Operator entered, Kindly follow the instruction given");
                }
            } else if (op == 2) {
                double radius, circumference;
                System.out.println("THIS PROGRAM CALCULATE THE CIRCUMFERENCE OF A CIRCLE");

                System.out.println("Enter value for radius");
                radius = inputScanner.nextDouble();

                circumference = 2 * 3.142 * radius;

                System.out.println("The circumference of this circle is " + circumference);
            } else if (op == 3) {
                double radius, radiusSquared, area;

                System.out.println("THIS PROGRAM CALCULATE THE AREA OF A CIRCLE");

                System.out.println("Input radius of the circle");
                radius = inputScanner.nextDouble();

                radiusSquared = radius * radius;
                area = 3.142 * radiusSquared;

                System.out.println("The Area of this circle is " + area);
            } else if (op == 4) {
                double firstNumber, secondNumber, thirdNumber, sum, average;

                System.out.println("THIS PROGRAM CALCULATE THE AVERAGE OF THREE NUMBERS");

                System.out.println("Enter First Number");
                firstNumber = inputScanner.nextDouble();
                System.out.println("Enter Second Number");
                secondNumber = inputScanner.nextDouble();
                System.out.println("Enter Third Number");
                thirdNumber = inputScanner.nextDouble();

                sum = firstNumber + secondNumber + thirdNumber;
                average = sum / 3;

                System.out.println("Average of Three Numbers is " + average);
            } else if (op == 5) {
                double firstNumber, secondNumber, thirdNumber, fourthNumber, sum, average;

                System.out.println("THIS PROGRAM CALCULATE THE AVERAGE OF FOUR NUMBERS");

                System.out.println("Enter First Number");
                firstNumber = inputScanner.nextDouble();
                System.out.println("Enter Second Number");
                secondNumber = inputScanner.nextDouble();
                System.out.println("Enter Tihrd Number");
                thirdNumber = inputScanner.nextDouble();
                System.out.println("Enter Fourth Number");
                fourthNumber = inputScanner.nextDouble();

                sum = firstNumber + secondNumber + thirdNumber + fourthNumber;
                average = sum / 4;

                System.out.println("The Average of Four Numbers is " + average);
            } else if (op == 6) {
                double firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber, sum, average;

                System.out.println("THIS PROGRAM CALCULATE THE AVERAGE OF FIVE NUMBERS");

                System.out.println("Enter First Number");
                firstNumber = inputScanner.nextDouble();
                System.out.println("Enter Second Number");
                secondNumber = inputScanner.nextDouble();
                System.out.println("Enter Third Number");
                thirdNumber = inputScanner.nextDouble();
                System.out.println("Enter Fourth Number");
                fourthNumber = inputScanner.nextDouble();
                System.out.println("Enter Fifth Number");
                fifthNumber = inputScanner.nextDouble();

                sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
                average = sum / 5;

                System.out.println("The Average of Five Numbers is " + average);
            } else if (op == 7) {
                double price, fiftyMangoes;

                System.out.println("THIS SOFTWARE CALCULTE THE PRICE OF FIFTY MANGOES");

                System.out.println("Enter the price");
                price = inputScanner.nextDouble();

                fiftyMangoes = price * 50;

                System.out.println("The Price Of Fifty Mangoes is " + fiftyMangoes);
            } else if (op == 8) {
                double actualSalary, reductionPercent, deductedSalary, takeHomeSalary;

                System.out.println("THIS PROGRAM IS USED TO DEDUCT FIVE PERCENT FROM STAFF'S SALARY");

                System.out.println("Enter value for Salary");
                actualSalary = inputScanner.nextDouble();
                reductionPercent = 5.0 / 100;

                deductedSalary = actualSalary * reductionPercent;
                takeHomeSalary = actualSalary - deductedSalary;
                System.out.println(deductedSalary + " was Deducted from your Salary and " + "Your Take Home Salary is " + takeHomeSalary);
            } else if (op == 9) {
                double Principal, Rate, Time, prod, simpleInterest;

                System.out.println("THIS SOFTWARE CALCULATE SIMPLE INTEREST");

                System.out.println("Enter the Principal");
                Principal = inputScanner.nextDouble();
                System.out.println("Enter the Rate");
                Rate = inputScanner.nextDouble();
                System.out.println("Enter the Time");
                Time = inputScanner.nextDouble();

                prod = Principal * Rate * Time;

                simpleInterest = prod / 100;

                System.out.println("The simple Interest is " + simpleInterest);
            } else if (op == 10) {
                double firstNumber, secondNumber, thirdNumber;

                System.out.println("THE SOFTWARE TO FIND HIGHEST OF THREE NUMBERS");

                System.out.println("Enter value for First Number");
                firstNumber = inputScanner.nextDouble();
                System.out.println("Enter value for Second Number");
                secondNumber = inputScanner.nextDouble();
                System.out.println("Enter value for third Number");
                thirdNumber = inputScanner.nextDouble();

                if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
                    System.out.println("First number is the highest number " + firstNumber);
                } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
                    System.out.println("Second number is the highest " + secondNumber);
                } else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
                    System.out.println("Third number is the highest " + thirdNumber);
                } else {
                    System.out.println("The Three Numbers are equal");
                }
            } else if (op == 11) {
                double firstNumber, secondNumber, thirdNumber, fourthNumber;

                System.out.println("THE SOFTWARE TO FIND HIGHEST OF FOUR NUMBERS");

                System.out.println("Enter value for First Number");
                firstNumber = inputScanner.nextDouble();
                System.out.println("Enter value for Second Number");
                secondNumber = inputScanner.nextDouble();
                System.out.println("Enter value for third Number");
                thirdNumber = inputScanner.nextDouble();
                System.out.println("Enter value for fourth Number");
                fourthNumber = inputScanner.nextDouble();

                if ((firstNumber > secondNumber) && (firstNumber > thirdNumber) && (firstNumber > fourthNumber)) {
                    System.out.println("First number is the highest number " + firstNumber);
                } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber) && (secondNumber > fourthNumber)) {
                    System.out.println("Second number is the highest " + secondNumber);
                } else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber) && (thirdNumber > fourthNumber)) {
                    System.out.println("Third number is the highest " + thirdNumber);
                } else if ((fourthNumber > firstNumber) && (fourthNumber > secondNumber) && (fourthNumber > thirdNumber)) {
                    System.out.println("Fourth number is the highest " + fourthNumber);
                } else {
                    System.out.println("The Four Numbers are equal");
                }
            } else if (op == 12) {
                double firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber;

                System.out.println("THE SOFTWARE TO FIND HIGHEST OF FIVE NUMBERS");

                System.out.println("Enter value for First Number");
                firstNumber = inputScanner.nextDouble();
                System.out.println("Enter value for Second Number");
                secondNumber = inputScanner.nextDouble();
                System.out.println("Enter value for third Number");
                thirdNumber = inputScanner.nextDouble();
                System.out.println("Enter value for fourth Number");
                fourthNumber = inputScanner.nextDouble();
                System.out.println("Enter value for fifth Number");
                fifthNumber = inputScanner.nextDouble();

                if ((firstNumber > secondNumber) && (firstNumber > thirdNumber) && (firstNumber > fourthNumber) && (firstNumber > fifthNumber)) {
                    System.out.println("First number is the highest number " + firstNumber);
                } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber) && (secondNumber > fourthNumber) && (secondNumber > fifthNumber)) {
                    System.out.println("Second number is the highest " + secondNumber);
                } else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber) && (thirdNumber > fourthNumber) && (thirdNumber > fifthNumber)) {
                    System.out.println("Third number is the highest " + thirdNumber);
                } else if ((fourthNumber > firstNumber) && (fourthNumber > secondNumber) && (fourthNumber > thirdNumber) && (fourthNumber > fifthNumber)) {
                    System.out.println("Fourth number is the highest " + fourthNumber);
                } else if ((fifthNumber > firstNumber) && (fifthNumber > secondNumber) && (fifthNumber > thirdNumber) && (fifthNumber > fourthNumber)) {
                    System.out.println("Fifth number is the highest " + fifthNumber);
                } else {
                    System.out.println("The Five Numbers are equal");
                }
            } else if (op == 13) {
                double a, b, c, d, product1, product2, A;

                System.out.println("THIS PROGRAM CALCULATE THE DETERMINANT OF A 2 by 2 MATRIX");

                System.out.println("Enter the value for a");
                a = inputScanner.nextDouble();
                System.out.println("Enter the value for b");
                b = inputScanner.nextDouble();
                System.out.println("Enter the value for c");
                c = inputScanner.nextDouble();
                System.out.println("Enter the value for d");
                d = inputScanner.nextDouble();

                product1 = a * d;
                product2 = b * c;
                A = product1 - product2;

                System.out.println("The determinant of this matrix is " + A);
            } else if (op == 14) {
                double a, b, c, d, e, f, g, h, i,
                        product1, product2, product3, product4, product5, product6,
                        subtract1, subtract2, subtract3,
                        parent1, parent2, parent3, A;

                System.out.println("THIS PROGRAM CALCULATE THE DETERMINANT OF A 3 by 3 MATRIX");

                System.out.println("Enter the value of a");
                a = inputScanner.nextDouble();
                System.out.println("Enter the value of b");
                b = inputScanner.nextDouble();
                System.out.println("Enter the value of c");
                c = inputScanner.nextDouble();
                System.out.println("Enter the value of d");
                d = inputScanner.nextDouble();
                System.out.println("Enter the value of e");
                e = inputScanner.nextDouble();
                System.out.println("Enter the value of f");
                f = inputScanner.nextDouble();
                System.out.println("Enter the value of g");
                g = inputScanner.nextDouble();
                System.out.println("Enter the value of h");
                h = inputScanner.nextDouble();
                System.out.println("Enter the value of i");
                i = inputScanner.nextDouble();

                product1 = e * i;
                product2 = f * h;
                product3 = d * i;
                product4 = f * g;
                product5 = d * h;
                product6 = e * g;

                subtract1 = product1 - product2;
                subtract2 = product3 - product4;
                subtract3 = product5 - product6;

                parent1 = a * subtract1;
                parent2 = b * subtract2;
                parent3 = c * subtract3;

                A = parent1 - parent2 + parent3;

                System.out.println("The determinant of this matrix is " + A);
            } else if (op == 15) {
                double a, b, c, d,
                        e, f, g, h,
                        i, j, k, l,
                        m, n, o, p,
                        product1, product2, product3, product4,
                        product5, product6, product7, product8,
                        product9, product10, product11, product12,
                        subtract1, subtract2, subtract3,
                        subtract4, subtract5, subtract6,
                        parent1, parent2, parent3, parent4, A;

                System.out.println("THIS PROGRAM CALCULATE THE DETERMINANT OF A 4 by 4 MATRIX");

                System.out.println("Enter the value of a");
                a = inputScanner.nextDouble();

                System.out.println("Enter the value of b");
                b = inputScanner.nextDouble();

                System.out.println("Enter the value of c");
                c = inputScanner.nextDouble();

                System.out.println("Enter the value of d");
                d = inputScanner.nextDouble();

                System.out.println("Enter the value of e");
                e = inputScanner.nextDouble();

                System.out.println("Enter the value of f");
                f = inputScanner.nextDouble();

                System.out.println("Enter the value of g");
                g = inputScanner.nextDouble();

                System.out.println("Enter the value of h");
                h = inputScanner.nextDouble();

                System.out.println("Enter the value of i");
                i = inputScanner.nextDouble();

                System.out.println("Enter the value of j");
                j = inputScanner.nextDouble();

                System.out.println("Enter the value of k");
                k = inputScanner.nextDouble();

                System.out.println("Enter the value of l");
                l = inputScanner.nextDouble();

                System.out.println("Enter the value of m");
                m = inputScanner.nextDouble();

                System.out.println("Enter the value of n");
                n = inputScanner.nextDouble();

                System.out.println("Enter the value of o");
                o = inputScanner.nextDouble();

                System.out.println("Enter the value of p");
                p = inputScanner.nextDouble();

                product1 = k * p;
                product2 = l * o;
                product3 = j * p;
                product4 = l * n;
                product5 = j * o;
                product6 = k * n;
                product7 = i * p;
                product8 = l * m;
                product9 = i * o;
                product10 = k * m;
                product11 = i * n;
                product12 = j * m;

                subtract1 = product1 - product2;
                subtract2 = product3 - product4;
                subtract3 = product5 - product6;
                subtract4 = product7 - product8;
                subtract5 = product9 - product10;
                subtract6 = product11 - product12;

                parent1 = f * subtract1 - g * subtract2 + h * subtract3;
                parent2 = e * subtract1 - g * subtract4 + h * subtract5;
                parent3 = e * subtract2 - f * subtract4 + h * subtract6;
                parent4 = e * subtract3 - f * subtract5 + g * subtract6;

                A = a * parent1 - b * parent2 + c * parent3 - d * parent4;

                System.out.println("The determinant of this matrix is " + A);
            } else if (op == 16) {
                double a, b, c, square, multi1, subt1, root, sum1, subt2, multi2, division1, division2, x1, x2;

                System.out.println("THIS PROGRAM CALCULATE QUADRATIC EQUATION");

                System.out.println("Enter the value for a");
                a = inputScanner.nextDouble();
                System.out.println("Enter the value for b");
                b = inputScanner.nextDouble();
                System.out.println("Enter the value for c");
                c = inputScanner.nextDouble();

                square = b * b;
                multi1 = 4 * a * c;
                subt1 = square - multi1;
                root = Math.sqrt(subt1);
                sum1 = -b + root;
                subt2 = -b - root;
                multi2 = 2 * a;
                division1 = sum1 / multi2;
                division2 = subt2 / multi2;

                x1 = division1;
                x2 = division2;

                System.out.printf("X1 is %.2f, X2 is %.2f%n", x1, x2);
            } else if (op == 17) {
                double displacement, time, velocity;

                System.out.println("THIS PROGRAM CALCULATE VELOCITY");

                System.out.println("Enter value for displacement");
                displacement = inputScanner.nextDouble();
                System.out.println("Enter value for time");
                time = inputScanner.nextDouble();
                if (time == 0) {
                    System.out.println("Enter a number value higher than zero");
                    time = inputScanner.nextDouble();
                }
                velocity = displacement / time;

                System.out.println("The velocity is " + velocity + "m/s");
            } else if (op == 18) {
                double pressure1, pressure2, volume1, volume2;
                int choice;

                System.out.println("THIS PROGRAM CALCULATE BOYLE'S LAW");
                System.out.println("Press 1 to Calculate Initial Pressure");
                System.out.println("Press 2 to Calculate Initial Volume");
                System.out.println("Press 3 to Calculate Final Pressure");
                System.out.println("Press 4 to Calculate Final Volume");
                choice = inputScanner.nextInt();

                if (choice == 1) {
                    System.out.println("Enter value for Initial Volume");
                    volume1 = inputScanner.nextDouble();
                    System.out.println("Enter value for Final Pressure");
                    pressure2 = inputScanner.nextDouble();
                    System.out.println("Enter value for Final Volume");
                    volume2 = inputScanner.nextDouble();
                    pressure1 = (pressure2 * volume2) / volume1;
                    System.out.printf("The Initial pressure is %.2f", pressure1);
                } else if (choice == 2) {
                    System.out.println("Enter value for Initial Pressure");
                    pressure1 = inputScanner.nextDouble();
                    System.out.println("Enter value for Final Pressure");
                    pressure2 = inputScanner.nextDouble();
                    System.out.println("Enter value for Final Volume");
                    volume2 = inputScanner.nextDouble();
                    volume1 = (pressure2 * volume2) / pressure1;
                    System.out.printf("The Initial pressure is %.2f", volume1);
                } else if (choice == 3) {
                    System.out.println("Enter value for Initial Pressure");
                    pressure1 = inputScanner.nextDouble();
                    System.out.println("Enter value for Initial Volume");
                    volume1 = inputScanner.nextDouble();
                    System.out.println("Enter value for Final Volume");
                    volume2 = inputScanner.nextDouble();
                    pressure2 = (pressure1 * volume1) / volume2;
                    System.out.printf("The Initial pressure is %.2f", pressure2);
                } else if (choice == 4) {
                    System.out.println("Enter value for Initial Pressure");
                    pressure1 = inputScanner.nextDouble();
                    System.out.println("Enter value for Initial Volume");
                    volume1 = inputScanner.nextDouble();
                    System.out.println("Enter value for Final Pressure");
                    pressure2 = inputScanner.nextDouble();
                    volume2 = (pressure1 * volume1) / pressure2;
                    System.out.printf("The Initial pressure is %.2f", volume2);
                } else {
                    System.out.println("Invalid input");
                }
            } else if (op == 19) {
                int loanAmount, loanDuration, month, monthlyPayment;
                double fixedInterest, monthlyInterest, totalMonthlyPayment;
                double totalInterest = 0, totalRepayment = 0;
                int outstandingBalance;

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
        }catch (Exception e){
            System.out.println("Input a number from 1 - 19");
        }
    }
}
