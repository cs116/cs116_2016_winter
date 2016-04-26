/* ***************************************************************************
 * filename    : FunctionTest.java
 * author      : George Corser, cs116, tr
 * description : Demostrates functions (methods)
 * ***************************************************************************
 */

import java.util.Scanner;

public class FunctionTest {

	private static int number = 0;

    public static void main(String args[]) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		number = sc.nextInt();

		if (addTwo(25)) System.out.println(addTwo(number));
		divideByFive(number);
		times25(number);
		times25((float)number);
	}

	private static boolean addTwo(int zippy) {
		System.out.println("Your number plus 2 is: ");
		System.out.println(number + 2);
		return true;
	}
	public static void divideByFive(int number) {
		System.out.println("Your number divided by 5 is: ");
		System.out.println((double)number / 5);
	}
	public static void times25(int number) {
		System.out.println("Your number times 25 is: ");
		System.out.println(number * 25);
	}
	public static void times25(float number) {
		System.out.println("Your number times 25.0f is: ");
		System.out.println(number * 25f);
	}

	public static void alphabet(){
		int number = 65;
		String s = "";
		while (number <= 90){
			s = Character.toString ((char) number);
			System.out.print(s);
			number++;
		}
	}
}
