package classes;
	class OuterrrClass{
		void outerMethod() {
			class LocalInnerClass{ // Local Inner Class----------*
				void display() {
					System.out.println("Inside Local Inner Class.");
				}
			}
			LocalInnerClass localI = new LocalInnerClass();
			localI.display();
		}
	}
public class LocalClass {
	public static void main(String[] args) {
		OuterrrClass outer = new OuterrrClass();
		outer.outerMethod();
		
	}
}
