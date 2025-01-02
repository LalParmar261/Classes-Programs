package classes;
	class OuterrClass{
		private static String staticOuterField = "Static Outer Field.";
		
		static class StaticInnerNestedClass{ // Static Nested class:

		void display() {
			System.out.println("Accessing from StaticInnerNestedClass: " + staticOuterField);
		}
	}
}
public class StaticNestedInnerClass {
	public static void main(String[] args) {
		// static inner class object
		OuterrClass.StaticInnerNestedClass nested = new OuterrClass.StaticInnerNestedClass();
		nested.display();
	}
}
