package practice_imp_Programs;

import java.util.Arrays;

public class SecondMaxNumberFromArray {
	public static void main(String[] args) {
		int a[] = { 20, 15, 75, 45, 100 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				System.out.println("data = "+ Arrays.toString(a));
			}
		}
		System.out.println("Descending order=" +Arrays.toString(a));
		System.out.println("Second maximun=" +a[1]); // prints second max

		// System.out.println(a[a.length-1]); //prints min
		// System.out.println(a[a.length-2]); //prints second min
	}
}
