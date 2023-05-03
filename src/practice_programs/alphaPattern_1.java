package practice_programs;

public class alphaPattern_1 {
public static void main(String[] args)
{
	String str="Globant";
	String temp=" ";
	for(int i=0;i<str.length();i++)
	{
		temp=temp+str.charAt(i);
		System.out.println(temp);
	}
}
}


/*output
 *G 
 * Gl 
 * Glo 
 * Glob 
 * Globa 
 * Globan 
 * Globant
*/