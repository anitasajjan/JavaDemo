package javabasics;

public class typeCastingDemo {
	public static void main(String[]args)
	{
		
		//widening
		int a = 10;
		float b=a;
		System.out.println(b);
		System.out.println(a);
		
		long c = 20;
		double d = c;
		System.out.println(d);
		
		//narrowing
		float x = 80.80f;
		int y = (int) x;
		System.out.println(y);
		
		double z = 89.90;
		long xy = (long) z;
		System.out.println(xy);
		
		int t = 60;
		byte k = (byte) t;
		System.out.println(k);
	
		//char to int
		char ca='B';
		int ac = ca;
		System.out.println(ac);
		
		
		//short to char
		short xyz = 65;
		char zyx = (char)xyz;
		System.out.println(zyx);
	}
	

}
