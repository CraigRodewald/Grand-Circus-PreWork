class Person {
	
	// Instance variables (data or "state")
	String name;
	int age;
	
	// Classes can contain
	
	// 1.Data
	// 2.Subroutine or methods
	void speak(){
		for (int i = 0; i < 3; i++) {
			System.out.println("My name is " + name + " and I am " + age + " years old");
		}
	}
	
	void sayHello(){
		System.out.println("Hello there!");
	}
}


public class Methods {
	public static void main(String[] args) {

		Person person1 = new Person();
		
		person1.name = "Craig Rodewald";
		person1.age = 36;
		person1.speak();
		person1.sayHello();
		
		Person person2 = new Person();
		
		person2.name = "Sarah Smith";
		person2.age = 20;
		person2.speak();
		person2.sayHello();
		
		System.out.println(person1.name);
	}
}
