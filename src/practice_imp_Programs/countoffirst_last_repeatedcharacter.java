package practice_imp_Programs;

import java.util.HashMap;

public class countoffirst_last_repeatedcharacter {
	public static void main(String[] args) {
		String a="Aarikass";
		char b[]=a.toCharArray();
		HashMap<Character,Integer> obj=new HashMap<Character,Integer>();
		for(int i=0;i<b.length;i++)
		{
			if(obj.containsKey(b[i]))
			{
				obj.put(b[i], obj.get(b[i])+1);
			}
			else
			{
				obj.put(b[i], 1);
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(obj.get(b[i]) == 1)
			{
				System.out.println("First non-repeated"+b[i]);
				break;
			}
		}
		for(char k:b)
		{
			if(obj.get(k) > 1)
			{
			System.out.println("First repeated" +k);
			break;
			}
			
		}
		
	}

}
