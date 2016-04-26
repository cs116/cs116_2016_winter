/*
 * Name: Devin Campbell
 * Class: CS116
 * Date: 02/14/16 
 */
public class Campbell {

	public static void main(String[] args) {
	// initialize values
		int digit1 = 0;
		int digit2 = 0;
		int Number = digit1*10 + digit2;
		// Test numbers from 0 to 100
		while(Number < 100){
			// test the two digit numbers
			if(digit1 > digit2) System.out.println(Number);
			// Increment the number using individual digits
			if(Number%10 == 9){
				digit1++;
				digit2 = 0;
			}else{
				digit2++;
			}
			// increments the next number
			Number = digit1*10 + digit2;
		}
	}
}
