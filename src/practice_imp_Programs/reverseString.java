package practice_imp_Programs;

public class reverseString 
{
public static void main(String[] args)
{
	String a= "Hello I am Anita";
	String words[]=a.split(" ");   //split by spaces and convert to array of words
	
	
	//print words from an array
	for(int i=0;i<words.length;i++)
	{
		System.out.println(words[i]+ " ");
	}
	
	
	//print reverse of words from an array
	String reverse="";
	for(int i=0;i<words.length;i++)
	{
		for(int j=words[i].length()-1;j>=0;j--)
		{
			reverse=reverse+words[i].charAt(j);
					
		}
		reverse=reverse+ " ";
	}
	System.out.println("Reverse of words = " +reverse );
	
}
}