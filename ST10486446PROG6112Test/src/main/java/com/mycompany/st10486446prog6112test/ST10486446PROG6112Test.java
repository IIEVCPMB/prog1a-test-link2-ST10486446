/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10486446prog6112test;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class ST10486446PROG6112Test {
// Question 1.Creating an application to display the runs scored by different batsmen at different stadiums 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define batsmen names
        String[] batsmen = {"Jacques Kallis", "Hashim Amia", "AB De Villiers"};
        
        // Define stadium names
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};
        
        // Create 2D array for runs scored [stadiums][batsmen]
        int[][] runs = new int[stadiums.length][batsmen.length];
        
        System.out.println("===================================================");
        System.out.println("      CRICKET RUNS DATA ENTRY SYSTEM");
        System.out.println("===================================================");
        System.out.println("Please enter the runs scored by each batsman at each stadium:\n");
        
        // Get user input for runs data
        for (int i = 0; i < stadiums.length; i++) {
            System.out.println("--- " + stadiums[i] + " Stadium ---");
            for (int j = 0; j < batsmen.length; j++) {
                System.out.print("Enter runs scored by " + batsmen[j] + ": ");
                runs[i][j] = scanner.nextInt();
            }
            System.out.println(); // Empty line for better readability
        }
        
        // Calculate total runs per batsman
        int[] batsmanTotals = new int[batsmen.length];
        for (int i = 0; i < batsmen.length; i++) {
            for (int j = 0; j < stadiums.length; j++) {
                batsmanTotals[i] += runs[j][i];
            }
        }
        
        // Calculate total runs per stadium
        int[] stadiumTotals = new int[stadiums.length];
        for (int i = 0; i < stadiums.length; i++) {
            for (int j = 0; j < batsmen.length; j++) {
                stadiumTotals[i] += runs[i][j];
            }
        }
        
        // Find stadium with most runs
        int maxStadiumIndex = 0;
        int maxStadiumRuns = stadiumTotals[0];
        for (int i = 1; i < stadiumTotals.length; i++) {
            if (stadiumTotals[i] > maxStadiumRuns) {
                maxStadiumRuns = stadiumTotals[i];
                maxStadiumIndex = i;
            }
        }
        
        // Display the report
        displayReport(batsmen, stadiums, runs, batsmanTotals, stadiumTotals, maxStadiumIndex, maxStadiumRuns);
        
        scanner.close();
    }
    
    public static void displayReport(String[] batsmen, String[] stadiums, int[][] runs, 
                                   int[] batsmanTotals, int[] stadiumTotals, 
                                   int maxStadiumIndex, int maxStadiumRuns) {
        
        System.out.println("\n\n===================================================");
        System.out.println("                   RUNS SCORED REPORT                ");
        System.out.println("===================================================");
        System.out.println();
        
        // Display header
        System.out.printf("%-15s", "Stadium");
        for (String batsman : batsmen) {
            System.out.printf("%-18s", batsman);
        }
        System.out.printf("%-15s%n", "Stadium Total");
        
        // Display separator line
        for (int i = 0; i < 15 + (18 * batsmen.length) + 15; i++) {
            System.out.print("-");
        }
        System.out.println();
        
        // Display runs data for each stadium
        for (int i = 0; i < stadiums.length; i++) {
            System.out.printf("%-15s", stadiums[i]);
            for (int j = 0; j < batsmen.length; j++) {
                System.out.printf("%-18d", runs[i][j]);
            }
            System.out.printf("%-15d%n", stadiumTotals[i]);
        }
        
        // Display separator line
        for (int i = 0; i < 15 + (18 * batsmen.length) + 15; i++) {
            System.out.print("-");
        }
        System.out.println();
        
        // Display batsman totals
        System.out.printf("%-15s", "Batsman Total");
        for (int total : batsmanTotals) {
            System.out.printf("%-18d", total);
        }
        System.out.printf("%-15s%n", "");
        
        System.out.println();
        System.out.println("===================================================");
        System.out.println("           TOTAL RUNS AT STADIUM                   ");
        System.out.println("===================================================");
        
        // Display stadium totals
        System.out.println("\nTOTAL RUNS SCORED AT EACH STADIUM:");
        for (int i = 0; i < stadiums.length; i++) {
            System.out.printf("%-15s: %,d runs%n", stadiums[i], stadiumTotals[i]);
        }
        
        // Display stadium with most runs
        System.out.println("\nSTADIUM WITH THE MOST RUNS SCORED:");
        System.out.printf("%s with %,d total runs%n", stadiums[maxStadiumIndex], maxStadiumRuns);
        
        System.out.println("===================================================");
        
    }
}