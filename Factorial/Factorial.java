/* Factorial.java
 */

public class Factorial
{
	public static void main(String[] args)
	{
		final int NUM_FACTS = 20;
		for(int i = 0; i < NUM_FACTS; i++) {
			long result = 1;
			for(int j = 2; j <= i; j++) result *= j;
			System.out.println( i + "! is " + result);
		}
	}

}
