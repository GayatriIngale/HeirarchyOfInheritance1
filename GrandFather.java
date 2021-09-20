package HierarchyOfInheritance;


//Multilevel Inheritance Program
public class GrandFather {
	void storedMoney() {
		System.out.println("Grandfather saves money..");
	}

}

class Father  extends GrandFather{
	void growTheMoney() {
		System.out.println("Father Grow the Money..");
	}
}

class Son extends Father{
	void spendMoney() {
		System.out.println("Son Use Money..");
	}

}

class MultilevelInharitance{
	public static void main(String args[]) {
		Son s = new Son();
		
		s.storedMoney();
		s.growTheMoney();
		s.spendMoney();
		
	}
}