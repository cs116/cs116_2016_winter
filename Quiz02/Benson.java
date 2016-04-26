/*	Author: Kelsi Benson
 *	Program: Quiz02
 *	Description: This program is an algorithm to print out only numbers
 *		in which the first digit is greater than the second digit.
 */

import java.util.Scanner;

public class Benson {

	public static void main(String[] args) {
	
		//next three lines initialize variables
		int digit1 = 0;
		int digit2 = 0;
		int number = digit1 * 10 + digit2;
		
		//while loop runs from 00-99 so that it only runs on two digit numbers
		while (number < 100) {
			
			//checks to see if the first digit is greater, if so, prints number
			if (digit1 > digit2) {
				System.out.println(number);
			}
			
			//checks to see if the number ends in a 9, if so adds 1 to digit1
			//and sets digit2 to 0.
			//if not, adds 1 to digit2
			if (number % 10 == 9) {
				digit1 = digit1 + 1;
				digit2 = 0;
			}
			else {
				digit2 = digit2 + 1;
			}
			
			//after ran through if statements, updates number to run again
			number = digit1 * 10 + digit2;
		}
	}

}