/*
Skyler Skrzypczak
CS116 Program07
25March2016
*/

import java.util.*;
import java.io.*;

public class Program07 {
	
    public static void main(String[] args) throws IOException {
        
		//scan in a list of integers	
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a list of integers");
		
		//subroutines to perform the functions of the program
        int n = numbersInInputFile();
        int integers[] = loadIntegers(n);
        integers = bubbleSort(integers, n);
        printResults(integers, n);   
    }
    
    public static int numbersInInputFile() throws IOException {
		//creates new temp file, scans in data, writes to it
		//increments counter to get the number of elements in file
        File file = new File("temp.data");
		BufferedWriter w = new BufferedWriter(new FileWriter(file));
		Scanner sc = new Scanner(System.in);
        int n = -1;
        String trash;
        do {
            trash = sc.nextLine();
			w.write(trash + "\n");
            n++;
        } while (!trash.equals(""));
		w.close();
        return n;
    }
    public static int[] loadIntegers(int n) throws IOException {
        //creates array and fills in with the data from temp.data
		int[] integers = new int[n];
		File temp = new File("temp.data");
        Scanner sc1 = new Scanner(temp);
        
        for(int k = 0; k < n; k++) {
            integers[k] = sc1.nextInt();
        }
		sc1.close();
        
        return integers;
    }
    public static int[] bubbleSort(int[] x, int y) {
        //bubblesort algorithm, flips numbers if in incorrect order
        int temp;
        int c = y;
        for (int b = 1; b < c; b++) {
            for (int a = 1; a < y; a++){
               if (x[a] < x[a-1]) {
                   temp = x[a];
                   x[a] = x[a-1];
                   x[a-1] = temp;
                }
            }
        }
        
        return x;
        
    } 
    public static void printResults(int[] a, int b) {
        //prints array in increasing order
		//adding a comment if it is divisble by 3
        for (int c = 0; c < b; c++) {
            
            if (a[c] % 3 == 0) {
                System.out.println(a[c] + " divisible by 3");
            }
            else System.out.println(a[c]);
        }
    }
}
