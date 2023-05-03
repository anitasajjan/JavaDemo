package javabasics;

public class MethodsDemo {

	// non static method with void
	public void method1() {
		System.out.println("hello");
	}

	// static method with void
	public static void method2() {
		System.out.println("Anita");
	}

	// parameterized static method with void
	public static void method3(String StudentName, int RollNo) {
		System.out.println("StudentName="+StudentName+" " +"RollNo="+RollNo);
	}

	// non static methos with return type-String
	public String method4() {
		String a = "ANU";
		return a;

	}

	public void method5() {
		String c = 5 + method4();
		System.out.println(c);
	}

	// void does not return anything

	public static void main(String[] args) {
		// we have to call the method
		// to call the method we have to create object of class
		// to create object of class syntax is - classname object=new classname();

		MethodsDemo a = new MethodsDemo();
		a.method1();
		method2();
		method3("Aarika",2);
		a.method4();
		a.method5();

	}
}
