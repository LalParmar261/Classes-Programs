package classess;

public class LocalInnerClass {
	public static void main(String[] args) {
        Outerclass outer = new Outerclass();
        outer.outerMethod();
    }
}

class Outerclass {
    void outerMethod() {
        class LocalInnerClass {
            void display() {
                System.out.println("Inside LocalInnerClass");
            }
        }
        LocalInnerClass local = new LocalInnerClass();
        local.display(); // Output: Inside LocalInnerClass
    }
}


