package Arrays;

import java.util.Arrays;

public class twoDimensionalArray {
	public static void main(String[] args) {
		               // 0th Array                //1st Array
		int a[][] = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 } };

		System.out.println(a.length); // prints length
		
                  //which array   //which index
		System.out.println(a[0][4]); // finds position of 4th index of 1st Array i.e 0th array
		System.out.println(a[1][1]); // finds position of 1st index of 2nd Array

		a[0][0] = 88; // Replace 88 value to 0th array of index 0
		System.out.println(a[0][0]);
		
		a[1][2] = 0; // Replace 0 value to 1st array of index 2
		System.out.println(a[1][2]);

		System.out.println(a[0].length + " " + a[1].length); // prints both array length

		// first way of printing an array
		System.out.println(Arrays.toString(a[0]) + Arrays.toString(a[1]));

		// second way of printing an array
		for (int i = 0; i < a.length; i++) // outer loop
		{
			for (int j = 0; j < a[i].length; j++) // inner loop
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		//   third way of printing an array
		for(int b[]:a)
		{
			for(int c:b)
			{
				System.out.print(c+ " ");
			}
			System.out.println();
		}
	}
}
