import java.util.*;
public class IsPrime {

    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
		int number = sc.nextInt();
		boolean yesOrNo = isPrime2(number);
		if (isPrime2(number))
            System.out.println("Oh, yes. It's prime all right.");
		else
			System.out.println("Oh, heck no. No no no.");
    }

	private static boolean isPrime2(int num) {
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}

