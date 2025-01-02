package classes;
abstract class ParentAbstract{

	public ParentAbstract(String message) { // abstract class constructor------
		System.out.println("Abstract class constructor, " + message);
	}
}
class Child extends ParentAbstract{

	public Child(String message) { // child class constructor-----------
		super(message); // calling the parent class constructors-----------
		System.out.println("This is from child class constructor....");
	}
	
}
public class AbstractClassConstructors {
	public static void main(String[] args) {
		Child child = new Child("is here...");
	}
}
