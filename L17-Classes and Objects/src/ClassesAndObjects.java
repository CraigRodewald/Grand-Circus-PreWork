class Person {
	
	// Instance variables (data or "state")
	String name;
	int age;
	
	// Classes can contain
	
	// 1.Data
	// 2.Subroutine or methods
}


public class ClassesAndObjects {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.name = "Craig Rodewald";
		person1.age = 36;
		
		Person person2 = new Person();
		
		person2.name = "Sarah Smith";
		person2.age = 20;
		
		System.out.println(person1.name);
	}
}
