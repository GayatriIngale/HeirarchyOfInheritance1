package HierarchyOfInheritance;


// Hierarchical Inheritance Program
public class Principle {
	void notice() {
		System.out.println("Notice About Attend..");
		
	}

}

class Teacher extends Principle{
	void displayAt() {
		System.out.println("Display On Notice Board..");
	}
	
}

class Student extends Principle{
	void viewedBySt() {
		System.out.println("Viewed By All Student....");
	}
	
}

 class HierarchicalInhar{
	 public static void main(String args[]) {
		 Student s = new Student();
		 Teacher t = new Teacher();
		 s.notice();
		 t.displayAt();
		 s.viewedBySt();
	 }
 }