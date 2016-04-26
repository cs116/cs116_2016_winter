/* ***************************************************************************
 * filename    : Program01.java
 * author      : George Corser, cs116, tr
 * description : This program prints population levels
 *               The purpose of the program is 
 *               to demonstrate sequence structure, decimal division 
 *               (as opposed to integer division), and variable typcasting
 * input       : none (population at year 0 is hard coded)
 * processing  : 1. declare and initialize variables
 *               2. compute populations of years 1 through 5
 *               3. print results
 * output      : Five lines of text in the following form:
 *               "Year 0 population: 312032486"
 *****************************************************************************/
import java.util.Scanner;
 
// class name, Program01, must match filename, Program01.java
public class Program01 { 

    // "main" method must exist
    public static void main(String[] args) { 
	
		// 1. declare and initialize variables
		
		// birth rate is one birth every seven seconds
        double birthRate; // declare double precision decimal variable
	    birthRate = 1.0 / 7; // assign rate to variable
		double deathRate; // declare double precision decimal variable
	    deathRate = 1.0 / 13; // assign rate to variable
		// can declare and assign in one line of code, as below
		double immigrationRate = 1.0 / 45;
		int secondsPerYear = 60 * 60 * 24 * 365;
	    int births = (int)(birthRate * secondsPerYear);
		int deaths = (int)(deathRate * secondsPerYear);
		int immigrants = (int)(immigrationRate * secondsPerYear);
	    int population = 312032486; // population of year zero
		int year1, year2, year3, year4, year5;
		
		// 2. compute populations of years 1 through 5	
		
		year1 = population + births - deaths + immigrants;
		year2 = year1 + births - deaths + immigrants;
		year3 = year2 + births - deaths + immigrants;
		year4 = year3 + births - deaths + immigrants;
		year5 = year4 + births - deaths + immigrants;
		
		// 3. print results	
		
		System.out.println("Year 0 population: " + population);		
		System.out.println("Year 1 population: " + year1);
		System.out.println("Year 2 population: " + year2);
		System.out.println("Year 3 population: " + year3);
		System.out.println("Year 4 population: " + year4);
		System.out.println("Year 5 population: " + year5);
    }
}
