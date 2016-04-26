// Beatty

import java.util.Scanner; 
// public class first {
public class Quiz02 {
// Declare and initialise global variables here
public static void main(String[] args) { // Declare local variables here
// Initialise local variables here
    int digit1; 
	int digit2; 
	int number; 
	digit1 = 0; 
	digit2 = 0; 
	number = digit1 * 10 + digit2; 
	//while (number < 100); { // INFINITE LOOP #1 because of semicolon : gpcorser
	while (number < 100) { // FIXED #1 : gpcorser
		if (digit1 > digit2) {
			System.out.println(number);
		}
	// } // INFINITE LOOP #2 because while has no terminator : gpcorser

	if (number % 10 == 9) { 
		digit1 = digit1 + 1; 
		digit2 = 0; 
	} 
	else  { 
		// (digit2 = digit2 + 1); // NOT LEGIT : gpcorser
		digit2 = digit2 + 1; // FIXED : gpcorser
	} 
	number = digit1 * 10 + digit2;
	} // FIXED #2 : gpcorser
}
}
	