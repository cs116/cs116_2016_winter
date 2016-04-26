/* Program05.java

 */
 
import java.io.*; // includes File, FileWriter, FileReader classes
import java.util.Scanner;

public class Program05 {

    public static void main(String args[]) throws IOException{
	
		// declare variables
		String lastname = "";
		String firstname = "";
		String number = "";
		String street = "";
		String streetType = "";
	
		// get user input
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter one-word last name or three-word address");
		String in1 = ""; // user input value (from input.data)
		String in2 = ""; 
		String in3 = ""; 
		
		in1 = sc.next(); // reads first word in input.data
		System.out.print(in1 + " ");
		if (sc.hasNext()){ // if there is another word
			in2 = sc.next();
		} else in2 = " ";
		// System.out.print(in2 + " ");
		if (sc.hasNext()){
			in3 = sc.next();
		} else in2 = " ";
		// System.out.println(in3 + " ");
	
		// System.out.println(args[0] + " " + args[1]);
		File file = new File("people.program05");

		//Creates a FileReader Object
		FileReader fr = new FileReader(file); 
		// wordnumber: 1=firstname, 2=lastname, 3=number, 4=street, 5=streetType
		int wordnumber = 1; 
		char [] a = new char[5000]; // define an array of chars
		fr.read(a); // reads the entire file contents into the array, a
		
		int arrayindex = 0; 
		while (a[arrayindex] != null){

			// read file into variables
			for(char c : a)	{// read through entire array, a, char by char
				arrayindex++;
				// if white space, either increment wordnumber or print both words
				if (c == ' ' || c == '\n') { // if whitespace, new word
					if (wordnumber != 5) {
						wordnumber++;	// increment wordnumber 
					}
					else {
						// if lastname is same as in1, then print 
						if (in1.equals(lastname)) {
							String printString = "";
							printString += firstname + " ";
							printString += lastname + " ";
							printString += number + " ";
							printString += street + " ";
							printString += streetType + " ";
							System.out.println(printString); 
							firstname = "";
							lastname = "";
							number = "";
							street = "";
							streetType = "";
						}
						wordnumber = 1;
					}
				}
				else { 
					// if white not space, 
					// then append the character to the current word
					switch (wordnumber) {
						case 1: firstname += c; break;
						case 2: lastname += c; break;
						case 3: number += c; break;
						case 4: street += c; break;
						default: streetType += c; break;
					}
				}
			} // end for
			// if variable equals search term, print
			if (lastname.equals(in1)) {
				String printstring = "";
				printstring += firstname + " "; 
				System.out.println(printstring);
			}
		} // end while
		fr.close();

		
    } // end main()
} // end class Program05

