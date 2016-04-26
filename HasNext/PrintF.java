/* PrintF.java
 */

public class PrintF
{
	public static void main(String[] args)
	{
		// initialize variables 
		int a = 123;
		int counter = 0;
		boolean b = true;
		char c = 'C';
		double d = 12300000.456;
		float f = 123.456f;
		String s = ""; // print string
		String n = "name";
		for (int i = 0; i < 5; i++) {
			System.out.printf("%10d %8.4f \n", a, d);
			counter = counter + 1; 
		}
		System.out.println(counter);
	}
}
