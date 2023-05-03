package practice_programs;

import java.util.Arrays;

public class countOfWords_String {
	public static void main(String[] args) {
		String a = "Aarika is my daugther";
		String Wordcount[] = a.split(" ");

		System.out.println(Arrays.toString(Wordcount));
		
		for(int i=0;i<Wordcount.length;i++)
		{
			System.out.println(Wordcount[i].length());
		}
	}

}
