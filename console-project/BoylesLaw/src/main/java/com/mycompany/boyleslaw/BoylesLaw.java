/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.boyleslaw;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BoylesLaw {

    public static void main(String[] args) {
        double pressure1, pressure2, volume1, volume2;
        int choice;
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("THIS PROGRAM CALCULATE BOYLE'S LAW");
        System.out.println("Press 1 to Calculate Initial Pressure");
        System.out.println("Press 2 to Calculate Initial Volume");
        System.out.println("Press 3 to Calculate Final Pressure");
        System.out.println("Press 4 to Calculate Final Volume");
        choice = inputScanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter value for Final Pressure");
            pressure2 = inputScanner.nextDouble();
            System.out.println("Enter value for Final Volume");
            volume2 = inputScanner.nextDouble();
            System.out.println("Enter value for Initial Volume");
            volume1 = inputScanner.nextDouble();
            pressure1 = (pressure2 * volume2) / volume1;
            System.out.printf("The Initial Pressure is %.2f", pressure1);
        } else if (choice == 2) {
            System.out.println("Enter value for Final Pressure");
            pressure2 = inputScanner.nextDouble();
            System.out.println("Enter value for Final Volume");
            volume2 = inputScanner.nextDouble();
            System.out.println("Enter value for Initial Pressure");
            pressure1 = inputScanner.nextDouble();
            volume1 = (pressure2 * volume2) / pressure1;
            System.out.printf("The Initial Volume is %.2f", volume1);
        } else if (choice == 3) {
            System.out.println("Enter value for Initial Pressure");
            pressure1 = inputScanner.nextDouble();
            System.out.println("Enter value for Initial Volume");
            volume1 = inputScanner.nextDouble();
            System.out.println("Enter value for Final Volume");
            volume2 = inputScanner.nextDouble();
            pressure2 = (pressure1 * volume1) / volume2;
            System.out.printf("The Final Pressure is %.2f", pressure2);
        } else if (choice == 4) {
            System.out.println("Enter value for Initial Pressure");
            pressure1 = inputScanner.nextDouble();
            System.out.println("Enter value for Initial Volume");
            volume1 = inputScanner.nextDouble();
            System.out.println("Enter value for Final Pressure");
            pressure2 = inputScanner.nextDouble();
            volume2 = (pressure1 * volume1) / pressure2;
            System.out.printf("The Final Volume is %.2f", volume2);
        } else {
            System.out.println("Invalid Choice Select a Number from 1 to 4");
        }

    }
}
