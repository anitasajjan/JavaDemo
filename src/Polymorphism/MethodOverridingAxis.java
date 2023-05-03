package Polymorphism;

public class MethodOverridingAxis extends MethodOverridingBank {
	public void checkbalance() {
		System.out.println("Your balance is Rs. 5,000");
	}

	public void method2() {
		System.out.println("Hello I am method2");
	}
	
	public static void main(String[] args)
	{
		//child reference        child object   All child and parent method will get called except override method(override method child will get call)
		MethodOverridingAxis a=new MethodOverridingAxis();
		a.method1();  //parent
		a.method2();  //child
		a.checkbalance();  //override method child
		
		//parent reference        parent object  Only parent method gets called
		MethodOverridingBank b=new MethodOverridingBank();
		b.method1();  //parent
		b.checkbalance(); //parent
		
		//parent reference        child object   All parent methods except overrided method(child overrided method gets called)
		//Up casting
		MethodOverridingBank c=new MethodOverridingAxis();
		c.method1();//parent
		c.checkbalance();//child
		
		//child reference   parent object  All parent and child methods except override method(child overrided method gets called)
		//Down casting MethodOverridingAxis d=new MethodOverridingBank();
		MethodOverridingBank d=new MethodOverridingAxis();
		MethodOverridingAxis child =(MethodOverridingAxis)d;
		child.method1();  //parent
		child.method2();  //child
		child.checkbalance(); //overrided method child gets called
	}
}
