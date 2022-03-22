import java.util.Scanner;

public class absoluteValue {
	public static void main(String args []) {
		// Creating scanner for user input
		Scanner input = new Scanner(System.in);
		int number;
		// Getting input from user
		System.out.println("Please enter integer: ");
		number = input.nextInt();
		// Change sign if number is negative
		if (number < 0) {
			number = -number;
		}
		// Displays Absolute value of number
		System.out.println("Absolute value: " + number);
		input.close();
	}
	
}
