/* George Beeman
 * Class: CS116 Monday/Wednesday 12:30
 * Program: Test 3/14/16
 * Goal: Print out a number where the first digit is larger than the second for integers 0-100
 * Output: Numbers
 */
public class Beeman {
	public static void main(String[] args){

	//Create integers digit1, digit2, and number
	int digit1;
	int digit2;
	int number;

	digit1 = 0;
	digit2 = 0;
	number = ((digit1 * 10) + digit2);

	//Run While loop
	while(number < 100){
		if(digit1 > digit2){
			System.out.println(number);
	}
		if(number % 10 == 9){
			digit1 = digit1 + 1;
			digit2 = 0;

	}else{ digit2 = digit2 + 1;

	}
	number = ((digit1 * 10) + digit2);

	}
	}
}
