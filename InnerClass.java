package classes;

class OuterClass{
	private String outerField = "OuterFIeld.";
	class InnnerClass { // *------------- Non-Static Inner class(Member Inner Class) -------------*

		void display() {
			System.out.println("Accessing from Inner Class: " + outerField);
		}
	}
}
public class InnerClass {
	public static void main(String[] args) {

		
		// 1-way
		OuterClass outerClass = new OuterClass();
		OuterClass.InnnerClass inner = outerClass.new InnnerClass(); // object of inner class
		inner.display(); 
		
		// 2nd - way
		
		OuterClass.InnnerClass oi = new OuterClass().new InnnerClass();
		oi.display();
	}
}
