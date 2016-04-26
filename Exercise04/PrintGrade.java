/* ****************************************
 * filename    : PrintGrade.java
 * author      : Your name not mine
 * course      : cs116
 * section     : 02-mw
 * semester    : winter2016
 *
 * input       : score (contained in file, input.data)
 * processing  : prints a grade based on a score
 * 				    1. get score
 * 				    2. set grade based on score
 *                  3. print grade
 * output      : statement: "Grade: " + grade
 *
 * ****************************************
 */

import java.util.*; // needed to use Scanner class

// prints a grade based on a score
public class PrintGrade {  
    public static void main(String[] args) { 
	    int score;
		char grade;
		
		// 1. get score
		Scanner sc = new Scanner(System.in); 
		score = sc.nextInt(); 
		
		// 2. set grade based on score
		grade = 'A';
		if (score < 90) grade = 'B';
		if (score < 80) grade = 'C';
		if (score < 70) grade = 'D';
		if (score < 60) grade = 'F';
		
		// 3. print grade
        System.out.println("Grade: " + grade);  
    }                                        
}                                            
