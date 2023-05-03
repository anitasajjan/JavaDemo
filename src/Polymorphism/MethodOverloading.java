package Polymorphism;

public class MethodOverloading {
	
/*   Method should have same name but different parameters
	 Rules:
	*Count of parameters should be different
	*Datatype should be different
	*Sequence of datatype should be different
*/
	public void addition(double a, int b)
	{
		System.out.println(a+b);
	}
	public void addition()
	{
		System.out.println();
	}
	public static void main(String[] args)
	{
		MethodOverloading poly = new MethodOverloading();
		poly.addition(89.7,8);
	}
}
