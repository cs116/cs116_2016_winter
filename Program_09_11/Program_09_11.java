/* *******************************************************************
* filename     : Program_09_11.java
* author       : George Corser
* svsuid       : gpcorser
* course       : cs116 
* section      : 02-MW
* semester     : Winter 2016
*
* description  : This program returns the solution to a linear equation,
*                or "The equation has no solution."
                 THis is program 9.11 from page 363 of textbook
* input        : none
* processing   : The program does the following. 
    1. get six numbers from user (or input file)
    2. print solution, or "The equation has no solution."

* output       : the solution, or the message that it is not solvable
* precondition : none (if using SubitJ, input.data must be in same directory
                 as executable code
* postcondition: the solution or message is printed on the screen
* ******************************************************************* 
*/
import java.util.Scanner;

/**
 *
 * @author gpcorser
 */
public class Program_09_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. get six numbers from user (or input file)
        System.out.println("Enter six numbers");
        Scanner sc = new Scanner(System.in);
        double [] z = new double[6];
        for (int i = 0; i < z.length ; i++){
            System.out.println("Enter number [" + i + "]:");
            z[i] = sc.nextDouble();
        }
        
        // 2. print solution, or "The equation has no solution."
        LinearEquation le2 = new LinearEquation(z[0], z[1], z[2], z[3], z[4], z[5]);
        if(le2.isSolvable())
            System.out.println("X:" + le2.getX() + " Y:" + le2.getY());
        else
            System.out.println("The equation has no solution.");
    }   
}

class LinearEquation {
    private double a, b, c, d, e, f;
    
    LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a; this.b = b; this.c = c; this.d = d; this.e = e; this.f = f; 
    }
    
    public double getA () {
        return a;
    }
    public double getB () {
        return b;
    }
    public double getC () {
        return c;
    }
    public double getD () {
        return d;
    }
    public double getE () {
        return e;
    }
    public double getF () {
        return f;
    }
    
    public boolean isSolvable() {
        // returns false if a * d - b * c == 0
        // i.e., returns false if not solvable
        return !(a * d - b * c == 0);
    }
    
    public double getX () {
        return (e * d - b * f) / (a * d - b * c);
    }
    
    public double getY () {
        return (a * f - e * c) / (a * d - b * c);
    }
}