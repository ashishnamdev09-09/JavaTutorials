package AbstractClassDemo;

abstract class animal {
	abstract void woof();
}


public class Dog extends animal{
	
	void woof() {
		System.out.println("Dog is barking");
	}

	public static void main(String[] args) {
		
		animal object = new Dog();
		object.woof();
	}

}
