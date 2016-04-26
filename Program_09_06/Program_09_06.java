/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author gpcorser
 */
public class Program_09_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        // Read an integer from a file: input.data
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("input.data"));
        int arraySize = sc.nextInt();
        
        StopWatch sw = new StopWatch();
        int [] array = new int [arraySize];
        array = generate100000();
        sw.start();
        doSelectionSort(array);
        sw.stop();
        System.out.println(sw.getElapsedTime());
    }
    
    /**
     * Generate an array of 100000 random integers
     * @param none there are no arguments
     */
    public static int [] generate100000() {
        int [] array = new int [100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (int) (100000 * Math.random());
        }
        return array;
    }
    
    /**
     * Sort an array of random integers using Selection Sort algorithm
     * @param arr a 1d array of integers to be sorted
     */
    // the code below was copied from
    // http://www.java2novice.com/java-sorting-algorithms/selection-sort/
    public static int[] doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
  
} // end class JavaApplication1

class StopWatch {
    
    private static long startTime;
    private static long endTime;
    
    StopWatch () {
        startTime = System.currentTimeMillis();
    }
    
    public static long getStartTime(){
        return startTime;
    }
    
    public static long getEndTime(){
        return endTime;
    }
    
    public static void start() {
        startTime = System.currentTimeMillis();
    }
    
    public static void stop () {
        endTime = System.currentTimeMillis();
    }

    public static long getElapsedTime(){
        return endTime - startTime;
    }
    
} // end class StopWatch

