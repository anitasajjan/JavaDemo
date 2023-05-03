package ArraysDemo;

import java.util.Arrays;

public class singleDimensionalArray {
	
	//To store multiple values in single variable of same data type
	//We cannot add or delete array values. We can only replace the values
	//Array size is always fixed
	
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };  //one way of declaring an array
		
		/* second way of declaring an array
		int b[]=new int[5];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		b[4]=50;*/

		System.out.println("Length= " +a.length); //prints length

		System.out.println("To access value of index 3 = " +a[3]); //to access specific value with index

		a[2] = 56; // Replace value
		System.out.println("Replace value of index 2 = " +a[2]);

		// a[5]=56; //this is not possible

		// first way
		System.out.println(Arrays.toString(a));

		// second way
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println("after for loop");

		/*
		 * Syntax of foreach loop 
		 * for(datatype new variable:old variable) {
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
