package classes;
	enum Days{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}
public class EnumMain {
	public static void main(String[] args) {
		Days today = Days.FRIDAY;
		switch (today) {
		case MONDAY: System.out.println("Monday");
		break;
		case TUESDAY: System.out.println("Tuesday");
		break;
		case WEDNESDAY: System.out.println("Wednesday");
		break;
		case THURSDAY: System.out.println("Thursday");
		break;
		case FRIDAY: System.out.println("Friday");
		break;
		default: System.out.println("Invalid.");
		break;
		
		}
	}
}
