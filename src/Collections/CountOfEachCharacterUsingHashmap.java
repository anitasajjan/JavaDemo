package Collections;

import java.util.HashMap;

public class CountOfEachCharacterUsingHashmap {
public static void main(String[] args) {
	String a="aaabbcdeeee";
	char ch[]=a.toCharArray();
	
	HashMap<Character,Integer> obj = new HashMap<Character,Integer>();
	//Apply for loop over the character array
	for(int i=0; i<ch.length;i++)
	{
		if(obj.containsKey(ch[i]))
		{
			obj.put(ch[i], obj.get(ch[i]) + 1);
		}
		else
		{
			obj.put(ch[i], 1);
		}
	}
	for(Character z:obj.keySet())
	{
		System.out.println(z+ " = "+obj.get(z));
	}
}
}
