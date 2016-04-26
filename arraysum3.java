/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author gpcorser
 */
public class JavaApplication1 {

    /**
     * filename     : JavaApplication1.java
     * author       : George Corser
     * course       : cs116 
     * section      : 01-TR
     * description  : This program generates 10x10 2d array and prints it
     * input        : none
     * processing   :
     *      1. declare 2d 10x10 array
     *      2. populate 2d array with random integers 
     *      3. print the array
     *      4. print the sum of all elements of the array
     *      5. print sum of column 3
     *      6. print index number of row with largest sum
     * output       : printed 10x10 array of random integers and sum
     * precondition : 
     * postcondition:
     * @author gpcorser
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. declare 2d 10x10 array
        int [][] matrix = new int[10][10];
        
        // 2. populate 2d array with random integers 
        matrix = populateArray();
        
        // 3. print the array
        printArray(matrix);
        
        // 4. print the sum of all elements of the array
        printSum(matrix);
        
        // 5. print sum of column 3 (index number 3)
        printSum3(matrix, 3);
        
        // 6. print index number of row with largest sum
        printRow(matrix);
        
        
    } // end "main" method
    
    public static int [][] populateArray(){
        int [][] matrix = new int[10][10];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (1000 * Math.random());
            }
        }
        return matrix;
    }
    
    public static void printArray(int [][] matrix){
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void printSum(int [][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of matrix is: " + sum);
    }
    
    public static void printSum3(int [][] matrix, int columnIndex){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            sum += matrix[i][3];
            // System.out.println(matrix[i][3]);
        }
        System.out.println("Sum of column [3] is: " + sum);
    }
    
    public static void printRow(int [][] matrix){
        int sum = 0, max = 0, row = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
            if (sum > max) {
                max = sum; 
                row = i;
            }
            sum = 0;
        }
        System.out.println("The row with highest sum is: " + row);
    }
} // end "JavaApplication1" class
