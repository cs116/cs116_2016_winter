/* filename: Test.java
   author  : George Corser, CS-116, Winter 2016, TR
*/

import java.util.*;
public class Test3 {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//System.out.println("Enter population: ");
		//int population = sc.nextInt();
        //System.out.println("Population is: " + population);
        int a = 5;
        int b = 7;
        System.out.println("a/b=" + a / b);
        double x = 26;
        double y = 13;
        System.out.println("x/y=" + x / y);
        System.out.println("x/a=" + x / a);
        float v = 0.0004f;
        float w = 0.0002f;
        System.out.println("v/w=" + v / w);

        // try this with int b and double x
        b = 13;
        while (b > 0)
        {
            b /= 2;
            System.out.println("b=" + b);
        }



        a = 1; b = 2;
        int c = 3; int d = 4; int r = 5;
        double result;
        result = 4 / (3d * (r + 34));
        result = result - 9 * (a + b * c);
        result = result + (3 + d * (2 + a)) / (double)(a + b * d);
        System.out.println("result=" + result);

        int bb = 0;
        System.out.println("(boolean)bb=" + (boolean)bb);

    }
}

