/* filename: Test4.java
   author  : George Corser, CS-116, Winter 2016, TR
*/

import java.util.*;
public class Test4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        int a = 5;
        int b = 7;
        System.out.println("a^b=" + Math.pow(a,b));
		
		a = 0;
		double c = 0.5;
		while (a < 10) {
            System.out.println(Math.rint(a+c));
			a++;
		}
		
		System.out.println(Math.rint(-1.5));
		System.out.println(Math.round(-1.5));
		
		a = 0;
		while (a < 10) {
		    System.out.println((int)(1 + 6 * Math.random()));
		    a++;
		}
		double x1, y1, x2, y2, x3, y3;
		System.out.println("Enter three points");
		System.out.println("Enter x1:");
		x1 = sc.nextDouble();
		System.out.println("Enter y1:");
		y1 = sc.nextDouble();
		System.out.println("Enter x2:");
		x2 = sc.nextDouble();
		System.out.println("Enter y2:");
		y2 = sc.nextDouble();
		System.out.println("Enter x3:");
		x3 = sc.nextDouble();
		System.out.println("Enter y3:");
		y3 = sc.nextDouble();
		
		double length_a, length_b, length_c;
		length_a = Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2);
		length_a = Math.sqrt(length_a);
		length_b = Math.pow((x1 - x3),2) + Math.pow((y1 - y3),2);
		length_b = Math.sqrt(length_b);
		length_c = Math.pow((x2 - x3),2) + Math.pow((y2 - y3),2);
		length_c = Math.sqrt(length_c);
		
		System.out.println(length_a);
		System.out.println(length_b);
		System.out.println(length_c);
		
		double A, B, C;
		A = Math.acos((length_a * length_a - length_b * length_b - length_c * length_c) / (-2 * length_b * length_c));
        B = Math.acos((length_b * length_b - length_a * length_a - length_c * length_c) / (-2 * length_a * length_c));
        C = Math.acos((length_c * length_c - length_b * length_b - length_a * length_a) / (-2 * length_a * length_b));

		System.out.println(Math.toDegrees(A));
		System.out.println(Math.toDegrees(B));
		System.out.println(Math.toDegrees(C));
		
		System.out.println(" .");
		System.out.println(" ");
		System.out.println(" .");
		System.out.println(" ");
		System.out.println(" .");
		System.out.println(" ");

    }
}

