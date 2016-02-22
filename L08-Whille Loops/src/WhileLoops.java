
public class WhileLoops {
	public static void main(String[] args) {
		boolean loop = 4 < 5;
		boolean loop2 = 6 < 1;
		
		System.out.println(loop);
		System.out.println(loop2);
		
		int value = 0;
		
		//the while condition is a boolean value
		while (value < 10) {
			System.out.println("Hello " + value);
			value = value + 1;
		}
	}
}
