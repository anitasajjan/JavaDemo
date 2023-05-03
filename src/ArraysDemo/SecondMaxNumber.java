package ArraysDemo;

import java.util.Arrays;

public class SecondMaxNumber {
	public static void main(String[] args) {
		int a[] = { 60, 15, 35, 82, 40 }; // stored multiple values in single variable
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Descending order=" + Arrays.toString(a));
		System.out.println("secondmax=" + a[1]);

	}
}
