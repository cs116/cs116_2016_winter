import java.util.Scanner; 
public class Brewer {
    // Declare and initialise global variables here
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Declare local variables here

        // Initialise local variables here
        int digit1, digit2, number;
        digit1 = 0;
        digit2 = 0;
        number = digit1 * 10 + digit2;
        while ((number < 100)) {
            if ( digit1 > digit2) {
                System.out.println(number);
            }
            if ((number%10)==9) {
                digit1+=1;
                digit2=0;
            }
            else {
                digit2+=1;
            }
            number = digit1 * 10 + digit2;
        }
    }
}
