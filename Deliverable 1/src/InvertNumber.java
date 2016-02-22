import java.util.Scanner;

public class InvertNumber {
	public static void main(String[] args) {
		
		// Initialize scanner object and variables
		Scanner input = new Scanner(System.in);
		int userInput = 0;
		int invertedNumber = 0;
		
		// Get user input
		System.out.println("Please enter a number: ");
		userInput = input.nextInt();
		
		// Do calculations
		while (userInput > 0) {
			
			invertedNumber = invertedNumber * 10;  // Adds a zero to the end of the invertedNumber variable
			invertedNumber = invertedNumber + (userInput % 10);  // Adds the last number of userInput to invertedNumber
			userInput = userInput / 10;  //  Knocks of the last number of userInput
		}
		
		// Output to console
		System.out.println(invertedNumber);
		
		// Close scanner object
		input.close();
	}
}
