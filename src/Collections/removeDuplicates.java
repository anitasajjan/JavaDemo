package Collections;

import java.util.HashSet;

public class removeDuplicates {
	public static void main(String[] args) {
		String a = "Anitaa";
		char[] p = a.toCharArray(); // converts to a new character array

		HashSet<Character> obj = new HashSet<Character>();

		// using for loop
		for (int i = 0; i < p.length; i++) {
			obj.add(p[i]);
		}
		System.out.println(obj);

		// using for each loop
		for (char t : p) {
			obj.add(t);
		}
		System.out.println(obj);

	}
}
