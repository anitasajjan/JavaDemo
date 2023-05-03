package Collections;

import java.util.ArrayList;

public class ArrayListDemo { // List---interface //ArrayList---class
	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(100); // add values
		obj.add(50);
		obj.add(30);
		obj.add(20);
		obj.add(65);
		obj.add(1, 3);

		System.out.println(obj); // prints all added values

		System.out.println(obj.get(1)); // prints the values from index 1

		obj.set(0, 6); // replace index 0 with value 6

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
		for (int k : obj) {
			System.out.println(k);
		}
	}
}
