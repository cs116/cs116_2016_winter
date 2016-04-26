/* ***************************************************************************
 * filename    : Program02.java
 * author      : George Corser, cs116, tr
 * description : This program prompts the user to enter monthly saving amount
				 and displays the account value after the sixth month 
 * input       : none (population at year 0 is hard coded)
 * processing  : 1. obtain monthly savings amount from user
 *               2. compute account value month by month
 *               3. print results
 * output      : Statement: "Balance after 6 months is..."
 *****************************************************************************/
import java.util.Scanner;
public class Program02 { 

    public static void main(String[] args) { 
	
		// 1. obtain monthly savings amount from user
		
		System.out.println("Enter monthly savings amount");
		Scanner sc = new Scanner (System.in);
		double amount = sc.nextDouble(); // month zero
		
		// 2. compute account value month by month
		
		int yearlyInterestRate = 5; // five percent per year
		double monthlyInterestRate = (yearlyInterestRate / 100.0) / 12; 	
		double interestAmount;
		double balance;
		
		balance = amount; // compute balance for month 0		
		interestAmount = monthlyInterestRate * balance + amount;
		balance = balance + interestAmount; // balance for month 1
		interestAmount = monthlyInterestRate * balance + amount;
		balance = balance + interestAmount; // balance for month 2
		interestAmount = monthlyInterestRate * balance + amount;
		balance = balance + interestAmount; // balance for month 3
		interestAmount = monthlyInterestRate * balance + amount;
		balance = balance + interestAmount; // balance for month 4
		interestAmount = monthlyInterestRate * balance + amount;
		balance = balance + interestAmount; // balance for month 5
		interestAmount = monthlyInterestRate * balance + amount;
		balance = balance + interestAmount; // balance for month 6
		
		// 3. print results
		
		System.out.printf("Balance after 6 months is: %.2f \n", balance);
    }
}