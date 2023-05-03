package Arrays;

import java.util.Arrays;

public class singleDimensionalArray {
	
	//To store multiple values in single variable
	//We cannot add or delete array values. We can only replace the values
	//Array size is always fixed
	
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };

		System.out.println(a.length); //prints length

		System.out.println(a[3]); //to access specific value with index

		a[2] = 56; // Replace value
		System.out.println(a[2]);

		// a[5]=56; //this is not possible

		// first way
		System.out.println(Arrays.toString(a));

		// second way
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println("after for loop");

		/*
		 * Syntax of foreach loop for(datatype newvariable:old variable) {
		 * System.out.println(newVariable)
		 */
		
		// third way--using for each loop --enhanced for loop
		for(int b:a)
		{
			System.out.println(b);
		}
		/*for (int b : a) {
			if (b <= 20) {
				System.out.println(b);
			} 
		}*/

	}
}
