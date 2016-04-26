import java.util.Scanner;

/**
 *
 * @author gpcorser
 */
public class SumOfTenDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        // TODO code application logic here
        int number = 1234567890;    // 1234567890
        int sum = 0;
        sum = sum + (number % 10);
        number = number / 10;       // 123456789
        sum = sum + (number % 10);
        number = number / 10;       // 12345678
        sum = sum + (number % 10);
        number = number / 10;       // 1234567
        sum = sum + (number % 10);
        number = number / 10;       // 123456
        sum = sum + (number % 10);
        number = number / 10;       // 12345
        sum = sum + (number % 10);
        number = number / 10;       // 1234
        sum = sum + (number % 10);
        number = number / 10;       // 123
        sum = sum + (number % 10);
        number = number / 10;       // 12
        sum = sum + (number % 10);
        number = number / 10;       // 1
        sum = sum + (number % 10);
        number = number / 10;       // 0

        System.out.println(sum);

    }

}
