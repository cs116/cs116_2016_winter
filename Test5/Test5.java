/* filename: Test5.java
   author  : George Corser, CS-116, Winter 2016, TR
   purpose : Demonstrate concepts in Chapter 4
*/

import java.util.*;
public class Test5 {
    private static void junk(){
        System.out.printf("junk\n");
    }

    public static void main(String[] args) {
        junk();
        // System.out.println(args[0] + " " + args[1] + " " + args[2]);

		Scanner sc = new Scanner (System.in);

		// demonstrate trig functions
		System.out.println("pi: " + Math.toDegrees(Math.PI));
		System.out.println("sine(pi): " + Math.round(Math.sin(Math.PI)));
		System.out.println("cosine(pi): " + Math.rint(Math.cos(Math.PI)));

		// test rounding
		System.out.println(Math.rint(-0.5));
		System.out.println(Math.round(-0.5));
		System.out.println(Math.rint(-1.5));
		System.out.println(Math.round(-1.5));

		// print random number
		System.out.println((int)Math.floor(1 + Math.random() * 6));
		System.out.println((int)Math.floor(1 + Math.random() * 6));
		System.out.println((int)Math.floor(1 + Math.random() * 6));
		System.out.println((int)Math.floor(1 + Math.random() * 6));
		System.out.println((int)Math.floor(1 + Math.random() * 6));

		
		// get 3 points, (x1, y1) and (x2, y2) and (x3, y3)
		double x1, y1, x2, y2, x3, y3;
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
		
		// compute lengths between points
		double a, b, c; 
        a = Math.sqrt(Math.pow((x2 - x3),2) + Math.pow((y2 - y3),2));
		b = Math.sqrt(Math.pow((x1 - x3),2) + Math.pow((y1 - y3),2));
		c = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
		
		// compute angles
		double A, B, C; 
		A = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
		B = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
		C = Math.acos((c * c - b * b - a * a) / (-2 * a * b));
		
		System.out.println("Angle A: " + A + "(" + Math.round(Math.toDegrees(A)) + ")");
		System.out.println("Angle B: " + B + "(" + Math.round(Math.toDegrees(B)) + ")");
		System.out.println("Angle C: " + C + "(" + Math.round(Math.toDegrees(C)) + ")");
		
		System.out.printf("Angle A: %.5f (" + Math.round(Math.toDegrees(A)) + ")\n", A);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
