/*
 * This program prints a multiplication table
 */
import java.util.Scanner;

public class MultiplicationTable {

        // declare variables
        double [] myList = new double[10]; // 1d array
        double [][] myTable = new double[10][10];
        Scanner sc = new java.util.Scanner(System.in);
        
        // prompt user for input
        System.out.println("Enter " + myList.length + " values: ");
        
        // assign values to array elements
        for (int i = 0; i < myList.length; i++) {
            myList[i] = sc.nextDouble();
        }
        // print array
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }
        
        // populate multiplication table
        for (int i = 0; i < myList.length; i++) {
            for (int j = 0; j < myList.length; j++) {
                myTable[i][j] = myList[i] * myList[j];
            }
        }
        // print multiplication table
        for (int i = 0; i < myList.length; i++) {
            for (int j = 0; j < myList.length; j++) {
                System.out.printf("%6.2f ",myTable[i][j]);
            }
            System.out.println();
        }
}
