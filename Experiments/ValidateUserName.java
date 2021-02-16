import java.util.Scanner;
public class ValidateUserName {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		String UserName = in.nextLine();
		
		// UserName can have Letters, Numbers, Underscore characters and it shd be more than 8 characters long & less than 16 characters long
		String regex = "\\w+";
		// \w matches any word character (equal to [a-zA-Z0-9_])
		
		if (UserName.contains(" ")) {
			System.out.println("Invalid username. Username shouldn't contain spaces");
			return;
		}
		
		if (UserName.length() >= 8 && UserName.length() < 16) {
			if (UserName.matches(regex)) {
				System.out.println("Valid Username :)");
			} else {
				System.out.println("InValid Username :(");
				System.out.println("Username should only contain Numbers, Letters and Underscore.");
			}
		} else {
			System.out.println("Username should be 8 to 15 characters long.");
		}
		
	}
}
