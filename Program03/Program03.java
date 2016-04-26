import java.util.Scanner;
public class Program03 {

    public static void main(String args[]) {
	
		// 1. declare variables
		String patientName;
		int patientID;
		float exam1, exam2, exam3;
		boolean isValid;
		double average;
		String posNeg;
		
		// 2. assign values to variables
		Scanner input = new Scanner(System.in);
		patientName   = input.next();
		patientID     = input.nextInt(); 
		exam1         = input.nextFloat();
		exam2         = input.nextFloat();
		exam3         = input.nextFloat();
		
		// 3. compute decision variables
		isValid = true; 
		if (patientID < 1111 || patientID > 9999)
			isValid = false;
		if (exam1 < 0 || exam1 > 100 ||
			exam2 < 0 || exam2 > 100 ||
			exam3 < 0 || exam3 > 100)
			isValid = false;
		average = (exam1 + exam2 + exam3) / 3;
		posNeg = "Neg";
		if (average > 70) posNeg = "Pos";
		if (average >= 97) posNeg = "Pos/Risk";
		
		// 4. print output
		
		// 4.a. print heading
		System.out.println("*~~< Patient Exam Report >~~*");
		System.out.println();
		System.out.printf("%10s %10s %10s %10s %10s %10s %10s \n",
			"Name","Patient ID","Exam1","Exam2","Exam3",
			"AVG","Pos/Neg");
		System.out.printf("%10s %10s %10s %10s %10s %10s %10s \n",
			"----","----------","-----","-----","-----",
			"---","-------");
		
		// 4.b. print patient info	
		if (isValid)
			System.out.printf("%10s %10d %10.2f %10.2f %10.2f %10.2f %10s \n",
				patientName,patientID,exam1,exam2,exam3,average,posNeg);
		else
			System.out.printf("%10s %10d %10.2f %10.2f %10.2f %21s \n",
				patientName,patientID,exam1,exam2,exam3,"~~ Invalid Data ~~");
		
		// 4.c. print footer
		System.out.println();
		System.out.println("*< end of report >*");
	}
}