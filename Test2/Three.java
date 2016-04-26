import java.util.*;
public class Three {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter population: ");
		int population = sc.nextInt();
		System.out.println("Enter area: ");
		double area = sc.nextDouble();
		System.out.println("Enter type of government: ");
		String government = sc.next();
		String output;
		output = "Population is: " + population;
		output = output + ", Area is: " + area;
		output = output + ", Government is: " + government;
        System.out.println(output);
    }
}
 
