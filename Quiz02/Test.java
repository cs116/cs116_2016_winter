/* ********************
 * Danny Whitmore
 * mw winter 2016
 * output all numbers between 0-100
 * ********************
 */
import java.util.Scanner;

public class Test {

	// Declare and initialise global variables here

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int digit1 = 0;
		int digit2 = 0;
		int number = digit1 * 10 + digit2;
		while (number < 100) {
			if (digit1 > digit2) {
				System.out.println(number);
			}
			if (number % 10 == 9) {
				digit1 = digit1 + 1;
				digit2 = 0;
			}
			else {
				digit2 = digit2 + 1;
			}
			number = digit1 * 10 + digit2;
			
		}
	}

}
