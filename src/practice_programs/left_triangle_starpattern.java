package practice_programs;

public class left_triangle_starpattern {
public static void main(String[] args)
{
	for(int i=0;i<=4;i++)//outer loop
	{
		for(int j=4;j>=i;j--) //first loop to give space
		{
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++)//second loop to print star *
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}
}


