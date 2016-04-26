/*
 * filename: Exercise04.java
 * author  : George Corser
 * course  : cs116, mw, winter 2016
 * input   : a score (0-100)
 * process : User enters a score, program prints a grade
 * output  : a grade (A, B, C, D, E or F)
 *
 * to compile, type "javac Hello.java" 
 * to run, type "java Hello" 
 */
import java.util.*;
public class Exercise04 {                    // class name must be same as file name
    public static void main(String[] args) { // standalone apps require main method or static initializer
	    int score;
		double zippy = 2.0;
		char grade;
		Scanner sc = new Scanner(System.in); 
		score = sc.nextInt(); 
		
		if (score > 100 || score < 0) {
		   System.out.println("Score must be <= 100 and >= 0");
		   System.exit(-1);
		}
		
		grade = 'A';
		if (score < 90) grade = 'B';
		if (score < 80) grade = 'C';
		if (score < 70) grade = 'D';
		if (score < 60) grade = 'F';
		
		if (score >= 90) {
		    grade = 'A';
		}
		else {
			if (score >= 80) {
				grade = 'B';
			}
			else {
				if (score >= 70) {
					grade = 'C';
				}
				else {
					if (score >= 60) {
						grade = 'D';
					}
					else {
						grade = 'F';
					}
				}
			}
		}
		
		if (zippy == score) System.out.println("zippy dee"); 

		if (score >= 90) {
		    grade = 'A';
		}
		if (score >= 80 ^ score < 90) {
		    grade = 'B';

			System.out.println("zippy!!"); 
		}
		
		score = score / 10;
		if (score > 9)
		{
			score = 9;
		}
		
		switch (score) {
			case 9: 
				grade = 'A';
				break; 
			case 8: 
				grade = 'B';
				break; 
			case 7: 
				grade = 'C';
				break; 
			case 6: 
				grade = 'D';
				break; 
			default: 
				grade = 'F';
				break; 
		}

        System.out.println("Grade: " + grade);  // System is a built-in class
    }                                        // close method specification
}                                            // close class specification
