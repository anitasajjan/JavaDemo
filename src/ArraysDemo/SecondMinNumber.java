package ArraysDemo;

import java.util.Arrays;

public class SecondMinNumber {
	public static void main(String[] args) {
		int a[] = { 90, 100, 50, 86, 5 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];  //90
					a[i] = a[j];  //50
					a[j] = temp;  //90  a[i]=50 a[j]90 50 100 90 
				}
			}
		}
		System.out.println("Ascending order=" + Arrays.toString(a));
		System.out.println("Secondmin=" + a[1]);
	}

}
