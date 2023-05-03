package practice_imp_Programs;

import java.util.Arrays;

public class SecondMinNumberFromArray {
	public static void main(String[] args) {
		int a[] = { 10, 10, 5, 90, 57, 76 };
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Ascending order=" + Arrays.toString(a));
		System.out.println("Second minimum=" + a[1]);

	}
}
