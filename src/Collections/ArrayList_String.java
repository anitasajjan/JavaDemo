package Collections;

import java.util.ArrayList;

public class ArrayList_String {

	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("hello");
		obj.add("Anita");
		obj.add("Aarika");
		obj.add("Prisha");

		System.out.println(obj); // prints all added values

		System.out.println(obj.get(1)); // prints the values from index 1

		
		System.out.println(obj.size()); // prints size

		System.out.println(obj.remove(1)); // removes value from index 1

		// obj.clear(); clears all values
		System.out.println(obj);

		// using for loop
		for (int i = 0; i < obj.size(); i++) {
			System.out.print(obj.get(i) + " ");
		}

		System.out.println();

		// using for each loop
		for (String k : obj) {
			System.out.println(k);
		}
	}
}
