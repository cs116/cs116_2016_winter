/* Exercise06.java
 * This program demonstrates the concept of a method
 */
 
public class Exercise06 {

    int global = 0; 

    public static void main(String args[]) {
	
	    int b = 27;
	    boolean x = true;
		x = Exercise06.isPrime(27);
		if (Exercise06.isPrime(b)) 
			System.out.println("27 is prime");
		else
			System.out.println("27 is not prime");
    }
	
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
		  if (n % i == 0) {
			return false;
		  }
		}
		return true;
  }
}




