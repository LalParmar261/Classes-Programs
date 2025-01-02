package classes;

class Animall {
}

class Dogg extends Animall {
}

public class InstanceOfClass {
	public static void main(String[] args) {
		Animall animall = new Animall();
		Animall dog = new Dogg();
		System.out.println(dog instanceof Dogg); // Output: true
		System.out.println(dog instanceof Animall); // Output: true
		
		System.out.println(animall instanceof Animall); // Output: true
		System.out.println(animall instanceof Dogg); // Output: false
	}

}
