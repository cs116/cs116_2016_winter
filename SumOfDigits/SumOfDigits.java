import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		// Prompt user for integer
		System.out.println("Enter an integer");

		// Declare and initialize variables
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int number = sc.nextInt();

		// Compute sum of digits
		while (number > 0) {
			sum = sum + ( number % 10 );
			number = number / 10;
		}

		// Print results
		System.out.println("The sum of the digits is: ");
		System.out.println(sum);
	}
}
