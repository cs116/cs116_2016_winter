/*
 * filename: s.java
 * author  : me
 *
 */
import java.util.Scanner; 
public class s {
	// Declare and initialise global variables here
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare local variables here
		int number;
		int sum;

		// Initialise local variables here
		number = 1234;
		sum = 0;

		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		System.out.println(sum);
	}
}
