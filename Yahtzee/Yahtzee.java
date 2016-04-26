//import java.util.Scanner; 
public class Yahtzee {
	// Declare and initialise global variables here
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare local variables here
		int die1, die2, die3, die4, die5;
		
		// Initialise local variables here
		
		die1 = (int)(1 + 6 * Math.random());
		die2 = (int)(1 + 6 * Math.random());
		die3 = (int)(1 + 6 * Math.random());
		die4 = (int)(1 + 6 * Math.random());
		die5 = (int)(1 + 6 * Math.random());
		System.out.println (die1 + " " + die2 + " " + 
die3 + " " + die4 + " " + die5);
		if (die1 == die2 && die2 == die3 && die3 == 
die4 && die1 == die2 && die4 == die5) {
			System.out.println("yahtzee!");
		}
		else {
			System.out.println("not yahtzee.");
		}
	}
}
