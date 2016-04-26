import java.util.Scanner;
/* * filename : QUIZ2
   * author : Jacob Bernard
   * class : CS116 W16
   * section : 02-mw
   *
   * input : digit1, digit2, number
   * processing : prints numbers 100
   * 1. get number
   * 2. prints numbers
  */
public class Bernard {
	public static void main(String[] args) {
		// variables
		int digit1 = 0;
		int digit2 = 0;
		int number = digit1*10+digit2;
		// set numbers
		while (number<100) {
			if (digit1>digit2) {
				System.out.println(number);
			}
			if (number%10==9) {
				digit1 = digit1+1;
				digit2 = 0;
			}
			else {
				digit2 = digit2+1;
			}
			number = digit1*10+digit2;
		}
	}

}