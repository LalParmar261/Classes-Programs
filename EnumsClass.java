package classes;
	enum Day{
		SUNDAY("Weekend"), // this is like a object. these are 7 different object created.
		MONDAY("Start of work week"),
		TUESDAY("Work day"),
		WEDNESDAY("Mid week"),
		THURSDAY("Work day"),
		FRIDAY("End of work week"),
		SATURDAY("Weekend");
		
		private final String description;
		private Day(String description) {
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		
	}
public class EnumsClass {
	public static void main(String[] args) {
		for (Day day : Day.values()) {
			System.out.println(day + " : " + day.getDescription());
		}
	}
}
