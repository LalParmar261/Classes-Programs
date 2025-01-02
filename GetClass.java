package classes;

class Animal {
}

class Dog extends Animal {
}

public class GetClass {
	public static void main(String[] args) {

		Animal dog = new Dog();
		System.out.println(dog.getClass()); // Output: class Dog
	}

}
