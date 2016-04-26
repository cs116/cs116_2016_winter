import java.util.*; // needed to use Scanner class
public class SetGrade {  
    public static void main(String[] args) { 
	    int score;
		char grade;
		Scanner sc = new Scanner(System.in); 
		score = sc.nextInt(); 
		
		// set grade based on score
		grade = 'A';
		if (score < 90) grade = 'B';
		if (score < 80) grade = 'C';
		if (score < 70) grade = 'D';
		if (score < 60) grade = 'F';
		
        System.out.println("Grade: " + grade);  
    }                                        
}                                            
