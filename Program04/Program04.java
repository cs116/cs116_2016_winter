/* ***************************************************************************
 * filename    : Program04.java
 * author      : George Corser, cs116, tr
 * description : This program reads through an input file and 
 *				 prints a report
 * input       : list of patient records in the following format...
 * processing  : 
 * output      : A report in a specific format (see instructions)
 *****************************************************************************/
import java.util.Scanner;

public class Program04 {

	// declare and initialize all variables
	public static String name;
	public static int patientID;
	public static char gender;
	public static float exam1, exam2, exam3;
	public static boolean isValid = true;
	public static float average = 0;
	public static String riskLevel = "";
	public static int redCount = 0;
	public static int orangeCount = 0;
	public static int yellowCount = 0;
	public static int blueCount = 0;
	public static int greenCount = 0;
	public static Scanner sc = new Scanner (System.in);

    public static void main(String args[]) {
	
		printHeader();
		
		// loop through input.data
		while(sc.hasNext()) {
		
			readRecord();

			// set isValid flag
			isValid = true;
			if (patientID < 1111 || patientID > 9999)
				isValid = false;
			if (exam1 > 100 || exam1 < 0)
				isValid = false;
			if (exam2 > 100 || exam2 < 0)
				isValid = false;
			if (exam3 > 100 || exam3 < 0)
				isValid = false;
				
			// compute average, risk level and color count
			average = (exam1 + exam2 + exam3) / 3;
			riskLevel = "GREEN";
			if (average > 70) riskLevel = "BLUE";
			if (average > 78) riskLevel = "YELLOW";
			if (average > 88) riskLevel = "ORANGE";
			if (average > 97) riskLevel = "RED";
			// if (riskLevel.equals("RED") redCount++;
			if (isValid) {
				switch (riskLevel){
					case "RED": redCount++; break;
					case "ORANGE": orangeCount++; break;
					case "YELLOW": yellowCount++; break;
					case "BLUE": blueCount++; break;
					default: greenCount++; break;
				}
			}
			
			// print report
			System.out.printf("%-12s ",name);
			System.out.printf("%5d ",patientID);
			System.out.printf("%3c ",gender);
			System.out.printf("%7.2f ",exam1);
			System.out.printf("%7.2f ",exam2);
			System.out.printf("%7.2f ",exam3);
			System.out.printf("\n");
			
			
		}
		System.out.print("RED       : ");
		for (int i = 0; i < redCount; i++)
			System.out.print("*");
		System.out.printf("\n");
		System.out.print("RED       : ");
		for (int i = 0; i < redCount; i++)
			System.out.print("*");
		System.out.printf("\n");
		System.out.print("RED       : ");
		for (int i = 0; i < redCount; i++)
			System.out.print("*");
		System.out.printf("\n");
    }
	
	public static void printHeader() {
		System.out.println("*~~< Patient Exam Report >~~*");
		String line = "";
		line = "Name		Pat. M/F	Exam1		Exam2		";
		line += "Exam3		AVG	Risk Level";
		System.out.println(line);
		line = "----		---- ---	-----		-----		";
		line += "-----		-----	----------";
		System.out.println(line);
	}

	public static void readRecord() {
		// read data into variables
		name = sc.next();
		patientID = sc.nextInt();
		gender = sc.next().charAt(0);
		exam1 = sc.nextFloat();
		exam2 = sc.nextFloat();
		exam3 = sc.nextFloat();
	}


}
