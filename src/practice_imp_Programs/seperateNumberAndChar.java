package practice_imp_Programs;

public class seperateNumberAndChar {
	public static void main(String[] args) {
		String s = "AnitaSajjan123@gmail.com";
		int upper = 0;
		int lower = 0;
		int number = 0;
		int special_character = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				upper++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				lower++;
			} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				number++;
			} else {
				special_character++;
			}
		}
		System.out.println("upper = " + upper);
		System.out.println("lower = " + lower);
		System.out.println("number = " + number);
		System.out.println("special_character = " + special_character);
	}
}
