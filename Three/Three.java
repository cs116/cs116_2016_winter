/* *******************************************************
 * filename
 * author      : Student Name
 * course      : cs116
 * section     : 01-TR
 * semester    : winter2016
 *
 * input       : this program accepts 4 user inputs
 *               1. byte
 *               2. int (population)
 *               3. double (area)
 *               4. String (type of government)
 *               input can come from file (ex: in1.data)
 *               if using SubmitJ
 * processing  : this program gets input, formats the input,
 *               then prints a formatted output string
 * output      : formatted string, for example...
 *               "Population is: 321321321, Area is: 444444.0, Government is: monarchy"
 *
 * *******************************************************
 */

import java.util.*;
public class Three {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// get input from user
        System.out.println("Enter byte:");
        byte byte1 = sc.nextByte();
		System.out.println("Enter population: "); 
		int population = sc.nextInt();
		System.out.println("Enter area: ");
		double area = sc.nextDouble();
		System.out.println("Enter type of government: ");
		String government = sc.next();
		
		// format output string
		String output = "";
		output += "Population is: " + population;
		output += ", Area is: " + area;
		output += ", Government is: " + government;
		
		// print output string
        System.out.println(output);
    }
}
 
