package Inheritance;

public class MultilevelDog extends MultilevelAnimal {
	public void method1() {
		System.out.println("Inheriting from Animal Class");
	}

	public static void main(String[] args) {
		MultilevelDog a = new MultilevelDog();
		a.method1();
		a.water();

	}
}
