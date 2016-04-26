/*
***************************************
*    Filename : Program10.java
*    Author   : Neal McCarthy
*    Class    : CS116 02 WI16 M/W
*    Input    : filing status, tax bracket, tax rate, taxable income
*    Process  :
*               //1. load inputted data
*               //2. Calculate tax for each Taxable Income, year, and filing status
*               //3. Print data 
*    Output   : Tax payment for $50-60K for each filing status in 2001 and 2009
***************************************
*/

import java.io.*;
import java.util.*;
import java.text.NumberFormat;
public class Program10 {
    public static void main(String[] args)throws IOException {
        //declare and initialize filingStatus
        Scanner fs = new Scanner(new FileReader("filingStatus.data"));
        int filingStatus = fs.nextInt();
        //Declare and initialize brackets
        Scanner br = new Scanner(new FileReader("brackets2001.data"));
        int[][] brackets = loadBrackets(br);
        //declare and initialize rates
        Scanner ra = new Scanner(new FileReader("rates2001.data"));
        double[] rates = loadRates(ra);
        //declare and initialize taxableIncome        
        double taxableIncome = 50000;
        //output for 2001 rates
        System.out.printf("%3s %3s %11s %15s %11s %11s %n", "Year", "Income", "Single", "Married J.", "Married S.", "Head of H.");  
        output(2001, filingStatus, brackets, rates, taxableIncome);
        //output for 2009 rates
        Scanner br2 = new Scanner(new FileReader("brackets2009.data"));
        brackets = loadBrackets(br2); 
        Scanner ra2 = new Scanner(new FileReader("rates2009.data"));
        rates = loadRates(ra2); 
        
        output(2009, filingStatus, brackets, rates, taxableIncome);
    } //end "main" method
    public static int[][] loadBrackets(Scanner br){
        //Declare and initialize brackets
        int[][] brackets = new int[5][5];
        //load each new line of input file for brackets into an array
        String[] line = new String[5];
        int row = 0;
        while(br.hasNextLine()){
            line[row] = br.nextLine();
            row++;
        }
        //put each line into array
        for(int i = 0; i < 4; i++){
            Scanner inz = new Scanner(line[i]);
            for(int j = 0; j < 4; j++){
                brackets[i][j] = inz.nextInt();
            }
        }
        return brackets; 
    } //end "loadBrackets" method
   public static double[] loadRates(Scanner ra) { 
        double[] rates = new double[5];
        for(int i = 0; i < rates.length; i++){
            rates[i] = ra.nextDouble();
        }
        return rates;
    } //end "loadRates" method 
   public static void output(int year, int filingStatus, int[][] brackets, double[] rates, double taxableIncome)  {
        //create an object of the "Tax" class
        Tax tx = new Tax(filingStatus, brackets, rates, taxableIncome);
        Locale locale = new Locale("en", "US");
        NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
        for(double ti = 50000; ti <= 60000; ti+=1000){
            tx.setTaxableIncome(ti);
            System.out.printf("%3d %3s", year, fmt.format(ti));
            for (int i = 0; i < 4; i++) {
                tx.setFilingStatus(i);
                System.out.printf("%12s", fmt.format(tx.getTax()));
            }
            System.out.println("");
        }
   } //end "output" method
} //end "Program10" class description

class Tax {
    private static int filingStatus;
    private static int[][] brackets;
    private static double[] rates;
    private static double taxableIncome;

    Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome =  taxableIncome;
    }

    Tax(){
    }
    
    
    public static void setFilingStatus(int status) {
        filingStatus = status;
    }

    public static void setBrackets(int[][] br) {
        brackets = br;
    }

    public static void setRates(double[] ra) {
        rates = ra;
    }

    public static void setTaxableIncome(double ti) {
        taxableIncome = ti;
    }

    public static int getFilingStatus(){
        return filingStatus;
    }

    public static int[][] getBrackets(){
        return brackets;
    }

    public static double[] getRates(){
        return rates;
    }

    public static double getTaxableIncome(){
        return taxableIncome;
    }

    public static double getTax(){
        /*int temp = 0;
        for(int i = 0; i < (brackets.length - 1); i++){
            if (brackets[i][filingStatus] < taxableIncome) {
                    temp++;
            }
        } 
         
        return (taxableIncome * rates[temp]); 
        */

        double tax = 0;
        double ti = taxableIncome;
        int i = 0;
        while(ti > 0){
            if (ti >= brackets[i][filingStatus]) {
                tax += brackets[i][filingStatus] * rates[i];
                ti = ti - brackets[i][filingStatus];
            } else {
                tax += ti * rates[i];
                ti = 0;
            }
            i++;
        } 
        return tax;   
    }
}
