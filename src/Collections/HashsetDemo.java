package Collections;

import java.util.HashSet;

public class HashsetDemo { // set--interface hashset---class
	public static void main(String[] args) {
		HashSet<Integer> obj = new HashSet<Integer>();
		obj.add(10); // add values
		obj.add(20);
		obj.add(30);
		obj.add(50);
		obj.add(10);
		System.out.println(obj);
		// obj.clear(); clears all values from set

		System.out.println(obj.size()); // prints size

		// obj.remove(10); //removes value
		System.out.println(obj);

		// using for each loop
		for (int k : obj) {
			System.out.println(k);
		}

	}

}
