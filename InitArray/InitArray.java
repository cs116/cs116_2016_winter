/*
 * This program allows user to enter values into an array
 */
import java.util.Scanner;

public class InitArray {

	public static void main(String [] args) {

		double [] myList = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + myList.length
			+ " values: ");
		for (int i = 0; i < myList.length; i++){
			 myList[i] = input.nextDouble();
		}

	}
}
