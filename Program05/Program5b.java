import java.util.Scanner;
import java.nio.files.*;

public class Program5b {

	public static void main(String[] args) throws IOException {		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		boolean useAddress = Character.isDigit(input.charAt(0));
		
		InputStream peopleStream = Files.newInputStream(Paths.get("people.program05"));
		Scanner people = new Scanner(peopleStream);
	
		while(people.hasNext()) {
			String firstName = people.next();
			String lastName = people.next();
			String address = people.nextLine().trim();
			
			if(useAddress && address.equals(input) || !useAddress && lastName.equals(input)) {
				System.out.println(firstName + " " + lastName + " " + address);
			}
		}
		
	}

}