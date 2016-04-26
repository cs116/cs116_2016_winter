import java.util.Scanner;

public class Yahtzee {

	// Declare and initialise global variables here

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare local variables here
		
		// Initialise local variables here
		
		int die01, die02, die03, die04, die05;
		
		die01 = 1 + (int) (6 * Math.random());
		die02 = 1 + (int) (6 * Math.random());
		die03 = 1 + (int) (6 * Math.random());
		die04 = 1 + (int) (6 * Math.random());
		die05 = 1 + (int) (6 * Math.random());
		
		String roll = "";
		roll += die01 + " ";
		roll += die02 + " ";
		roll += die03 + " ";
		roll += die04 + " ";
		roll += die05 + " ";
		
		System.out.println(roll);
	}

}