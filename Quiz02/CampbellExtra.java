/*
 * Name: Devin Campbell
 * Class: CS116
 * Date: 02/14/16 
 * 
 * 
 */

import java.util.Scanner;

public class CampbellExtra {

	public static void main(String[] args) {
		
		
		// imput limit maximum limit
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a numeric limit: ");
		int limit = input.nextInt();
		
		// Test each number smaller then the limit starting at 10
		for(int i = 10; i < limit; i++){
			String Number = Integer.toString(i);
			// set the testing variable for every value number to false
			boolean test = false;
				// tests each number against its following digit
				for(int a = 0; a < (Number.length()-1); a++){
					
					char digit1 = Number.charAt(a);
					char digit2 = Number.charAt(a+1);
					
					// Switches the testing variable if internal numbers are not decreasing
					
					if (digit1 < digit2){
						test = true;
					}else if (digit1 == digit2){
						test = true;
					}
				}
				// if testing variable passes all tests, print the numeric value
				if(test == false){
					System.out.println(i);
				}
			
		}
	}
}

