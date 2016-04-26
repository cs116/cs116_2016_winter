// name: George Corser, cs116, tr

import java.util.*; // needed to use Scanner class
class Leapyear { // class name must be same as file name

	// every java program must have main method
    // or static method
	public static void main(String [] args) {

        // ----- GET year ----

        // Prompts the user to enter a year
		System.out.println("Enter a year:");

		// Computer waits for user to enter the year
		Scanner sc = new Scanner(System.in);

		// store user input into year variable
		int year = sc.nextInt();

		// print test line for debugging
		System.out.println("This is a test: " + year);

        // ----- initialize variables ------------------------------------------
		boolean leapyear = false;

        // ----- perform computations ------------------------------------------
        if (year % 4 == 0) { // If year divisible by 4, set leapyear = TRUE.
            leapyear = true;
			System.out.println("Leapyear4: " + leapyear);
        }
        if (year % 100 == 0) {	// If year divisible by 100, set leapyear = FALSE.
            leapyear = false;
			System.out.println("Leapyear100: " + leapyear);
        }
        if (year % 400 == 0) {	// If year divisible by 400, set leapyear = TRUE.
            leapyear = true;
			System.out.println("Leapyear400: " + leapyear);
        }

		if (leapyear == true) {
		    System.out.println(year + " is a leapyear.");
		}
		else {
			System.out.println(year + " is not a leapyear.");
		}

    }
}
