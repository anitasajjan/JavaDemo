package practice_imp_Programs;

import java.util.Arrays;

public class CountWords {
	public static void main(String[] args) {
		String a = "Hello I am Anita";
		// we have to split the string

		// Store splitted string in an array
		String words[] = a.split(" ");

		// words[]= {"Hello","I","am","Anita"};
		System.out.println(words.length); // length of array--words count

		// first way
		System.out.println(Arrays.toString(words));

		// second way
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
		System.out.println();
		System.out.print("Reverse of String");
		System.out.println();

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
		System.out.println();

		// third way
		for (String b : words) {
			System.out.print(b + " ");
		}
		System.out.println();

		// length of each word
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].length());
		}
		System.out.println();

		// find out char from words

		System.out.println(a.charAt(6));

	}
}
