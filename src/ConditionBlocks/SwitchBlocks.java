package ConditionBlocks;

public class SwitchBlocks {
	public static void main(String[] args) {
		// int
		int day = 2;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		default:
			System.out.println("Sunday");
		}
		
		//char
		char weekday ='a';
		switch(weekday)
		{
		case 'e':
			System.out.println("Monday");
			break;
		case 'd':
			System.out.println("Tuesday");
			break;
		case 'c':
			System.out.println("Wednesday");
			break;
		case 'b':
			System.out.println("Thursday");
			break;
		case 'a':
			System.out.println("Friday");
			break;
		default:
			System.out.println("Sunday");
			
		}
		
		// string
		String days = "d";
		switch (days) {
		case "a":
			System.out.println("Monday");
			break;
		case "b":
			System.out.println("Tuesday");
			break;
		case "c":
			System.out.println("Wednesday");
			break;
		case "d":
			System.out.println("Thursday");
			break;
		case "e":
			System.out.println("Friday");
			break;
		default:
			System.out.println("Sunday");

		}

	}
}
