/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10486446prog6112testq2;

/**
 *
 * @author lab_services_student
 */

    abstract class AbstractCricket implements Cricket {
    private String batsmanName;
    private String stadiumName;
    private int totalRuns;
    
    // Constructor
    public AbstractCricket(String batsmanName, String stadiumName, int totalRuns) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.totalRuns = totalRuns;
    }
    
    // Getter methods
    @Override
    public String getBatsman() {
        return batsmanName;
    }
    
    @Override
    public String getStadium() {
        return stadiumName;
    }
    
    @Override
    public int getRunsScored() {
        return totalRuns;
    }
}


