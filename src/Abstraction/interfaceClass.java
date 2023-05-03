package Abstraction;

public class interfaceClass implements interfaceDemo {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Hey I am Anita");
	}
public static void main(String[] args) {
	interfaceClass a= new interfaceClass();
	a.method1();
	a.method2();
}
}
