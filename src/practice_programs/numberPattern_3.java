package practice_programs;

public class numberPattern_3 {
	public static void main(String[] args)
	{
		int a=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i+1;j++)
			{
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
	}
}


/*output
1
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/