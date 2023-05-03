package javabasics;

public class OperatorsDemo {
public static void main(String[] args)
{
//Arithmetic operators
  //Addition
	int a = 10;
	int b= 20;
	int c = a+b;
	System.out.println(c);
	
	//Subtraction
	int a1 = 20;
	int b1 = 6;
	int c1 = a1-b1;
	System.out.println(c1);
	
	//Division
	float d = 10;
	float e = 50;
	float f = d/e;
	System.out.println(f);
	
	//Multiplication
	int x=12;
	int y = 3;
	int z = x*y;
	System.out.println(z);
	
	//Modulus
	int t= 150;
	int k = 120;
	int g = t%k;
	System.out.println(g);
	
	
	//increment and decrement operator
	
	//increment
	//preincrement
	int ab= 15;
	System.out.println(++ab);
	System.out.println(ab);
	
	//postincrement
	int abc = 75;
	System.out.println(abc++);
	System.out.println(abc);
	
	//decrement
	//predecrement
	int ca = 12;
	System.out.println(--ca);
	System.out.println(ca);
	
	//postdecrement
	int cab = 25;
	System.out.println(cab--);
	System.out.println(cab); 
	
	//comparison operator  //<,>,<=,>=,==,!=
	int xy = 50;
	System.out.println(xy>25);
	System.out.println(xy<15);
	System.out.println(xy>=30);
	System.out.println(xy<=90);
	System.out.println(xy==60);
	System.out.println(xy!=12);
	
	//Java Logical Operators  // && || !
	int zx = 20;
	System.out.println(zx<5 && zx>15);
	System.out.println(zx<5 || zx>6);
	System.out.println(!(zx<5 || zx>6));
	
}
}
