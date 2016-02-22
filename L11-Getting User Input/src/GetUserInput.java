import java.util.Scanner;

public class GetUserInput {
	public static void main(String[] args) {
	//Ctrl + Shift + O imports needed libraries
		
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter a line of text: ");
		
		// Wait for the user to enter a line
		String line = input.nextLine();
		
		// Tell them what they entered
		System.out.println("You entered: " + line);
		
		System.out.println("\nEnter a number: ");
		
		int number = input.nextInt();
		
		System.out.println("You entered: " + number);
	}
}
