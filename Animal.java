package HierarchyOfInheritance;

// Single inheritance Program
public class Animal {
	void run() {
		System.out.println("Running....");
	}

}

class Dog extends Animal{
	void eat() {
		System.out.println("dog is eating...");
	}
	
}

class SingalInher {
	public static void main(String args[]) {
		Dog  d = new Dog();
		d.eat();
		d.run();
	}
}
