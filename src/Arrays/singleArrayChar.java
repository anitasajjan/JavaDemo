package Arrays;

import java.util.Arrays;

public class singleArrayChar {
	public static void main(String[] args) {
		char a[] = { 'a', 'n', 'i', 't', 'o' };
		System.out.println(Arrays.toString(a));

		//length
		System.out.println("Length= " + a.length); 

		// Replace
		a[4] = 'a'; 

		// Just print a, n, i
		for (int i = 0; i < a.length - 2; i++) {
			System.out.print(a[i]);
		}
		
		System.out.println(" ");
 
		//using for each loop
		for (char t : a) {
			System.out.print(t);
		}

	}
}
