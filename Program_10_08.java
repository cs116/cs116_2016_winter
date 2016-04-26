/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author gpcorser
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tax tx = new Tax();
        tx.setTaxableIncome(70000);
        tx.setFilingStatus(Tax.SINGLE_FILER);
        System.out.println(tx.getTax());
    }
    
}

class Tax {
    
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    
    // maximum values from Table 10.1 page 402
    // these are the top end values of the tax bracket
    public static int [][] brackets = {
        {27050, 45200, 22600, 36250},
        {65550, 109250, 54625, 93650},
        {136750, 166500, 83250, 151650},
        {297351, 297351, 148676, 297351},
        {1000000, 1000000, 1000000, 1000000}
    }; 
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
    public double getTax () {
        int bracketIndex = 0;
        double tax = 0;
        double remainingIncome = this.taxableIncome;
        while (remainingIncome > 0) {
            if (this.filingStatus == SINGLE_FILER) {
                
                // bracket 0: 15%
                if (remainingIncome > brackets[bracketIndex][SINGLE_FILER]) {
                    tax = rates[bracketIndex] * brackets[bracketIndex][SINGLE_FILER];
                }
                else {
                    tax = rates[bracketIndex] * remainingIncome;
                    remainingIncome = 0;
                }
                
                //bracket 1: 27.5%
                bracketIndex++;
                if (remainingIncome > brackets[bracketIndex][SINGLE_FILER]) {
                    tax += rates[bracketIndex] * 
                            ( brackets[bracketIndex][SINGLE_FILER]
                            - brackets[bracketIndex - 1][SINGLE_FILER] );
                }
                else {
                    if (remainingIncome != 0) 
                        tax += rates[bracketIndex] * 
                            ( remainingIncome 
                            - brackets[bracketIndex - 1][SINGLE_FILER]);
                    remainingIncome = 0;
                }     
                
                // bracket 2: 30.5%
                bracketIndex++;
                if (remainingIncome > brackets[bracketIndex][SINGLE_FILER]) {
                    tax += rates[bracketIndex] * 
                            ( brackets[bracketIndex][SINGLE_FILER]
                            - brackets[bracketIndex - 1][SINGLE_FILER] );
                }
                else {
                    if (remainingIncome != 0) 
                        tax += rates[bracketIndex] * 
                            ( remainingIncome 
                            - brackets[bracketIndex - 1][SINGLE_FILER]);
                    remainingIncome = 0;
                } 
                
                //bracket 3: 35.5%
                bracketIndex++;
                if (remainingIncome > brackets[bracketIndex][SINGLE_FILER]) {
                    tax += rates[bracketIndex] * 
                            ( brackets[bracketIndex][SINGLE_FILER]
                            - brackets[bracketIndex - 1][SINGLE_FILER] );
                }
                else {
                    if (remainingIncome != 0) 
                        tax += rates[bracketIndex] * 
                            ( remainingIncome 
                            - brackets[bracketIndex - 1][SINGLE_FILER]);
                    remainingIncome = 0;
                }      
                
                //bracket 4: 39.1%
                bracketIndex++;
                System.out.println(bracketIndex);
                
                if (remainingIncome > brackets[bracketIndex][SINGLE_FILER]) {
                    tax += rates[bracketIndex] * 
                            ( brackets[bracketIndex][SINGLE_FILER]
                            - brackets[bracketIndex - 1][SINGLE_FILER] );
                }
                else {
                    if (remainingIncome != 0) 
                        tax += rates[bracketIndex] * 
                            ( remainingIncome 
                            - brackets[bracketIndex - 1][SINGLE_FILER]);
                    remainingIncome = 0;
                }    
                
            }
        }
        return tax;
    }
} // end class Tax
