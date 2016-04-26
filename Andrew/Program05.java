/* Program05.java
 * This program prints the contents of people.program05
 * two words per line.
 */ 
 
import java.io.*; // includes File, FileWriter, FileReader classes
import java.util.Scanner;

public class Program05 {

    public static void main(String args[]) throws IOException{
	
		Scanner sc = new Scanner (System.in);
		String in1 = ""; 
		int in2 = ""; 
		String in3 = "";
		String in4 = "";
		boolean isValid = true; // assume input.data is valid
		//boolean isName = true; // assume input.data contains a name
		int printcount = 0; // if printcount == 0 at end of program
							// print "Invalid Input Data"
		
		in1 = sc.next(); // reads first word in input.data
		if (sc.hasNext()){ // if there is another word
			in2 = sc.nextInt();
		}
		if (sc.hasNext()){
			//isName = false; // it's an address
			in3 = sc.next();
		}
		if (sc.hasNext()){
			in4 = sc.next();
		}
		
		if (sc.hasNext()){ // if there is another word
			isValid = false;
			System.out.println("Invalid Data"); // too many values in input data
		}
	
		// System.out.println(args[0] + " " + args[1]);
		
		File file = new File("people.program05");

		//Creates a FileReader Object
		FileReader fr = new FileReader(file); 
		String word1 = "";
		String word2 = "";
		String word3 = "";
		String word4 = "";
		
		int wordnumber = 1;
		char [] a = new char[5000]; 
		fr.read(a); // reads the entire file contents into the array, a
		
		for(char c : a)	{// read through entire array, a, char by char
			// if white space, either increment wordnumber or print both words
			if (c == ' ' || c == '\n') {
				if (wordnumber == 1) {
					wordnumber = 2;	// increment wordnumber 
				}
				else {
					wordnumber = 1;
					// if last name is same as input data, print the line
					if (in1.equals(word1)) 
					     System.out.println(word1 + " " + word2 + " " + word3 + " " + word4); 
					word1 = "";
					word2 = "";
					word3 = "";
					word4 = "";
					
				}
			}
			else { 
			    // if white not space, then append the character to the current word
				if (wordnumber == 1){
					word1 += c;}
				if (wordnumber == 2){ 
					word2 += c;}
				if (wordnumber == 3){
					word3 += c;}
				if (wordnumber == 4){
					word4 += c;}
				
				
		        // System.out.print(c); //prints characters one by one
			}
		}
		
		fr.close();
		
    }
}


/*
import java.util.*;
import java.io.*;
public class Program05
{
	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new FileReader("people.program05"));
		String str = " ";
		while(sc.hasNext()){
			str = sc.next();
			System.out.println(str);
			//System.out.printf("Last name: %-10s, score: %8.2f \n", name, score);
		}
	}
}

		// creates the file
		// file.createNewFile();
		// creates a FileWriter Object
		//FileWriter writer = new FileWriter(file); 
		// Writes the content to the file
		//writer.write("This\n is\n an\n example\n"); 
		//writer.flush();
		//writer.close();

*/