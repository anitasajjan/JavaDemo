package Abstraction;

public abstract class abstractiondemo {
/* 
 * Abstraction means hiding sensitive data and show only essential information
 *  Abstract methods are created in abstract class only
 *  Abstract class cannot create an object. Using inheritance another class can create an object
 * Abstract methods do not have body. Body is provided by the subclass(inherited from)
 * Abstract methods have both regular and abstract methods
 */
	
	//concrete method--non abstract method--regular method
	public void method1()
	{
		System.out.println("Hello I am method1");
	}
	 
	//abstract method
	abstract void method2();
	abstract void method3();
	
}
