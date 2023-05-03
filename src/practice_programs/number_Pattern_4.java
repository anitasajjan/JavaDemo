package practice_programs;

public class number_Pattern_4 {
public static void main(String[] args)
{
	for(int i=4; i>=1;i--)
	{
		for(int j=4; j>=i;j--)
		{
			System.out.print(j+ " ");
		}
		System.out.println();
	}
	
}
}




/*output
4
4 3 
4 3 2 
4 3 2 1 
*/