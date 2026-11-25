/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.agecalculatorversion2;

import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author USER
 */
public class AgeCalculatorVersion2 {

    public static void main(String[] args) {
        int currentDay, currentMonth, currentYear, birthDay, birthMonth, birthYear, ageDay, ageMonth, ageYear;
        Scanner inputScanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();

        System.out.println("AGE CALCULATOR");

        currentDay = today.getDayOfMonth();
        currentMonth = today.getMonthValue();
        currentYear = today.getYear();

        System.out.print("Enter Birth Day: ");
        birthDay = inputScanner.nextInt();
        System.out.print("Enter Birth Month: ");
        birthMonth = inputScanner.nextInt();
        System.out.print("Enter Birth Year: ");
        birthYear = inputScanner.nextInt();

        if (birthDay > currentDay) {
            currentMonth = currentMonth - 1;
            currentDay = currentDay + 30;
        } else if (birthMonth > currentMonth) {
            currentYear = currentYear - 1;
            currentMonth = currentMonth + 12;
        } else {
            
        }
        
        ageDay = currentDay - birthDay;
        ageMonth = currentMonth - birthMonth;
        ageYear = currentYear - birthYear;

        if (birthYear > currentYear){
            System.out.println("Invalid birth Date");
        }else{
            System.out.println("Today's Date: " + currentDay + "/" + currentMonth + "/" + currentYear);
            System.out.println("You are " + ageYear + " Years, " + ageMonth + " Months, " + ageDay + " Days");
        }
       
    }
}
