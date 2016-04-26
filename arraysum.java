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
     * This program generates 10x10 2d array and prints it
     * input        : none
     * processing   :
     *      1. declare 2d array
     *      2. populate 2d array with random integers 
     *      3. print the array
     *      4. print the sum
     * output       : printed 10x10 array of random integers and sum
     * precondition : 
     * postcondition:
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. declare 2d array
        int [][] numbers = new int[10][10];
        
        // 2. populate 2d array with random integers 
        numbers = genRandomArray();
        
        // 3. print the array
        printArray(numbers);
        
        // 4. print the sum
        System.out.println("Sum: " + sumArray(numbers));
       
    } // end "main" method
    
    public static int[][] genRandomArray(){
        int [][] array10 = new int[10][10];
        for(int i = 0; i < array10.length; i++){
            for(int j = 0; j < array10[i].length; j++){
                array10[i][j] = (int) (100 * Math.random());
            }
        }
        return array10;
    } // end "genRandomArray" method
    
    public static void printArray(int [][] array10){
        for(int i = 0; i < array10.length; i++){
            for(int j = 0; j < array10[i].length; j++){
                System.out.printf("%3d ", array10[i][j]);
            }
            System.out.println();
        }
    } // end "printArray" method
        
    public static int sumArray(int [][] array10){
        int sum = 0;
        for(int i = 0; i < array10.length; i++){
            for(int j = 0; j < array10[i].length; j++){
                sum += array10[i][j];
            }
        }
        return sum;
    } // end "sumArray" method
    
} // end "JavaApplication1" class definition
