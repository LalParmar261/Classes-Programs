package classes;
	abstract class AbstractClass{
		abstract void abstractMethod();
	}
public class AnnonymousClass {
//	//An anonymous inner class is a type of inner class with no name.
//	It is used to instantiate objects with a class that extends or implements 
//	another class or interface on the fly.
	public static void main(String[] args) {

		AbstractClass abc = new AbstractClass() { // Anonymous Inner Class--------*
			
			@Override
			void abstractMethod() {

				System.out.println("Anonymous Inner Class Implementation.");
			}
		};
		abc.abstractMethod();
	}
}
