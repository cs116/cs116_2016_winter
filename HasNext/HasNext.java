/* HasNext.java
 */

import java.util.*;
public class HasNext
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name = "";
		char gender = ' ';
		int id = 0;
		float score = 0.0f; 
		while(sc.hasNext()){
			name = sc.next();
			gender = sc.next();
			id = sc.nextInt();
			score = sc.nextFloat();
			// System.out.println(name + " " + gender + " " + id + " " + score);
			System.out.printf("Last name: %-10s, score: %8.2f \n", name, score);
		}
	}
}
