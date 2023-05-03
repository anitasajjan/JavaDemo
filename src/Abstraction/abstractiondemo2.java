package Abstraction;

public class abstractiondemo2 extends abstractiondemo {

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("I am an abstract method");
	}

	@Override
	void method3() {
		// TODO Auto-generated method stub
		System.out.println("another abstract method");
	}

	public static void main(String[] args) {
		abstractiondemo2 a = new abstractiondemo2();
		a.method1();
		a.method2();
		a.method3();
	}
}
