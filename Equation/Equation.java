/* filename: Eq.java
   author  : George Corser, CS-116, Winter 2016, TR
   purpose : Demonstrates corrections for integer division
             (Equation is from textbook, page 50, Section 2.11)
*/
import java.util.*;
public class Equation {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		System.out.println("Enter c: ");
		int c = sc.nextInt();
		System.out.println("Enter x: ");
		int x = sc.nextInt();
		System.out.println("Enter y: ");
        int y = sc.nextInt();
        double result1;
        double result2;
        double result3;
        double finalresult;
        result1 = (3 + 4 * x) / 5d;
        result2 = 10 * (y - 5) * (a + b + c) / (x * 1d);
        result3 = 9 * (4d / x + (9 + x) / (y * 1d) );
        finalresult = result1 - result2 + result3;
        System.out.println("Final result is: ");
        System.out.println(finalresult);
    }
}
