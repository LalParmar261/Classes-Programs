package classes;

public abstract class MyAbstractClass {
	public static void main(String[] args) {
        System.out.println("Main method in Abstract Class");
    }

    abstract void display();  // Abstract method
}

class ConcreteClass extends MyAbstractClass {
    @Override
    void display() {
        System.out.println("Concrete class display method");
    }


}