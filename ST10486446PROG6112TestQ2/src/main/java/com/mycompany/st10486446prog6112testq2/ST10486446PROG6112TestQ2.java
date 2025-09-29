/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10486446prog6112testq2;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class ST10486446PROG6112TestQ2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("The cricketer name : ");
        String batsmanName = scanner.nextLine();
        
        System.out.print("Enter the stadium : ");
        String stadiumName = scanner.nextLine();
        
        System.out.print("Enter the total runs scored by " + batsmanName + " at " + stadiumName + " : ");
        int totalRuns = scanner.nextInt();
        
        // Create CricketRunsScored object
        CricketRunsScored cricketReport = new CricketRunsScored(batsmanName, stadiumName, totalRuns);
        
        // Print the report
        cricketReport.printReport();
        
        scanner.close();
    }
}
