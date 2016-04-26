import java.util.*; public class Debuf {
	public static void main (String args[]){
		//declare var and set to 0
		int digit1;
		digit1 = 0;
		int digit2;
		digit2 = 0;
		int number;
		number = digit1 * 10 + digit2;
		//while loop
		while(number < 100){
		//if statement
		if (digit1 > digit2){
		digit2 = digit2 + 1;
		} // missing: gpcorser
		if (digit2 > digit2){
		digit1 = digit1 + 1;
		} // missing: gpcorser
		if (number % 10 == 9){
		digit1 = digit1 + 1;
		} // missing: gpcorser
			else{System.out.println(number);
			} // missing: gpcorser
		} // missing: gpcorser
	}
}
