package Arrays;

import java.util.Arrays;

public class singleArrayString {
public static void main(String[] args)
{
	String a[]= {"Anita","Aaru","Prisha","Prakash"};
	
	System.out.println(a.length+ " "); //prints length
	
	a[1]="Aarika";  //Replace
	
	System.out.print(Arrays.toString(a)+" ");  //first way
	
	for(int i=0;i<a.length;i++)    //second way
	{
		System.out.println(a[i]+ " ");
	}
	
	System.out.println(" ");
	
	for(String b:a)    //third way
	{
		System.out.println(b);
	}

}
}
