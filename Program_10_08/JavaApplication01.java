/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author gpcorser
 */
public class JavaApplication01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Tax tx = new Tax();
        double taxableIncome = 1000.0;
        tx.setTaxableIncome(taxableIncome);
        tx.setFilingStatus(Tax.SINGLE_FILER);
        tx.loadBracketsAndRates(2001);
        System.out.println("Tax on income of " + taxableIncome
            + " for filing status " + tx.getFilingStatus()
            + " is " + tx.getTax());
    }
    
} // end class: JavaApplication01

class Tax {
    
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    
    // maximum values for tax brackets from Table 10.1, page 402
    // these are the top end values of the tax bracket for year: 2001
    public static int [][] brackets = {
        {27050, 45200, 22600, 36250},
        {65550, 109250, 54625, 93650},
        {136750, 166500, 83250, 151650},
        {297351, 297351, 148676, 297351},
        {1000000, 1000000, 1000000, 1000000}
    }; 

    // for 2009 values, use Table 3.2, page 90
    public static double [] rates = {0.15, 0.275, 0.305, 0.355, 0.391};
    
    private int filingStatus;
    private double taxableIncome;
    
    public void setFilingStatus (int status) {
        this.filingStatus = status;
    } 
    public int getFilingStatus () {
        return this.filingStatus;
    } 
    public void setTaxableIncome (double income) {
        this.taxableIncome = income;
    }
    public double getTaxableIncome () {
        return this.taxableIncome;
    }
    
    /**
     * Returns tax based on filing status and taxable income
     * This code modified from code written by: Neal McCarthy
     * @param none
     */    
    public double getTax (){

        double tax = 0;
        double rti = taxableIncome; // rti: remaining taxable income
        
        if(rti <= brackets[0][filingStatus]){
            // if total taxable income is less than max of first bracket
            // then all income is taxed at lowest rate, i.e. rates[0]
            tax = rti * rates[0];
        }
        else {
            // otherwise, lowest portion of income is taxed at lowest rate...
            tax = brackets[0][filingStatus] * rates[0];
            rti = rti - brackets[0][filingStatus];
            // ... and portions of income above lowest bracket are taxed at progressively 
            // higher rates, so loop through higher tax brackets ...
            int br = 1; 
            while(rti > 0){
                // if income is higher than current bracket max, then max tax for bracket, br
                if (rti > brackets[br][filingStatus] - brackets[br - 1][filingStatus]) {
                    tax += (brackets[br][filingStatus] - brackets[br - 1][filingStatus]) * rates[br];
                    rti -= brackets[br][filingStatus]; // decrement remaining taxable income
                } 
                // otherwise, tax the highest portion of income at current bracket, br
                else {
                    tax += rti * rates[br];
                    rti = 0; // exit loop
                }
                br++;
            } 
        }
        return tax;   
    } // end method: getTax()
    
    public static void loadBracketsAndRates (int year) throws FileNotFoundException {
        
        // load the brackets
        Scanner sc = new Scanner(new File (year + ".brackets"));
        brackets = new int [10][10];
        int i = 0; int j = 0;
        while(sc.hasNextInt()) {
            brackets[i][j] = sc.nextInt();
            if (j == 3) {System.out.println(brackets[i][j] + " "); j = 0; i++;}
            else {System.out.print(brackets[i][j] + " "); j++;}
        }

        // load the rates
        sc = new Scanner(new File (year + ".rates"));
        rates = new double[10];
        i = 0; 
        while(sc.hasNextDouble()) {
            rates[i] = sc.nextDouble();
            System.out.print(rates[i] + " ");
            i++;
        }
        System.out.println();
    }
    
} // end class: Tax
