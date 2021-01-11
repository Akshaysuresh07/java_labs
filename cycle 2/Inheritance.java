class A1{
	
	void displayA1() {
		System.out.println("This is Parent class");
	}
}
	
class A2 extends A1{
	void displayA2() {
			System.out.println("This is Child class");
	}
}
	
public class Inheritance {
	public static void main(String[] args) {
		
		//calling method of parent class by object of parent class
		A1 ob1 = new A1();
		ob1.displayA1();
		
		//calling method of child class by object of child class
		A2 ob2 = new A2();
		ob2.displayA2();
		
		
		
		//calling method of parent class by object of child class
		ob2.displayA2();
		
		
		
		
	}
}
	