/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10486446prog6112testq2;

/**
 *
 * @author lab_services_student
 */


    class CricketRunsScored extends AbstractCricket {
    
    // Constructor
    public CricketRunsScored(String batsmanName, String stadiumName, int totalRuns) {
        super(batsmanName, stadiumName, totalRuns);
    }
    
    // Method to print the report
    public void printReport() {
        System.out.println("\n**BATSMAN RUNS SCORED REPORT**");
        System.out.println("***********");
        System.out.println("**CRICKET PLAYER** : " + getBatsman());
        System.out.println("**STADIUM** : " + getStadium());
        System.out.println("**TOTAL RUNS SCORED** : " + getRunsScored());
    }
}

