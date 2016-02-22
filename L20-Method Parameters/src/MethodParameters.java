class Robot{
	public void speak(String speech){
		
		System.out.println(speech);
	}
	
	public void jumb(int height){
		
		System.out.println("Jumping: " + height);
	}
	
	public void move(String direction, double distance) {
		
		System.out.println("Moving " + distance + " meters in direction " + direction);
	}
}

public class MethodParameters {
	public static void main(String[] args) {
		
		Robot sam = new Robot();
		
		sam.speak("Hi, I am Sam.");
		sam.jumb(7);
		
		sam.move("West", 12.2);
		
		String greeting = "Hello there.";
		
		sam.speak(greeting);
		
		int value = 14;
		sam.jumb(value);
	}
}
