 package Loops;

public class forLoopDemo {
public static void main(String[]args)
{
	/*
	 for loop syntax
	 for(statement 1, statement2, statement3)
	 {
	 statement 1 ---intitialization
	 statement 2 ---condition
	 statement 3 ---increment/decrement
	 }*/
	 
	
	for(int i=1; i<=10; i++)
	{
		System.out.println(i);
	}
	
	//reverse
	for (int i=10; i>=1; i--)
	{
		System.out.println(i);
	}
	for (int j= 5; j<10; j++)
	{
		System.out.println(j+" "+"hello");
	}
	for(int i=1;i<=5;i++)
	{
		System.out.print("*");
	}
}
}
