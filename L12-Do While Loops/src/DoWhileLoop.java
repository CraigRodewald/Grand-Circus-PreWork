import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int value = 0;
		/*
		System.out.println("Enter a number: ");
		value = scanner.nextInt();
		
		while (value != 5) {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		*/
		
		do {
			System.out.println("Enter a neumber: ");
			value = scanner.nextInt();
		} while (value != 5);
		
		System.out.println("Got 5!");
	}
}
