package ConditionBlocks;

public class ifElseDemo {
	public static void main(String[] args) {
		int studentMarks = 95;

		if (studentMarks > 90) {
			System.out.println("Distinction");
		} else if (studentMarks > 70 && studentMarks <= 90)

		{
			System.out.println("First Class");
		} else if (studentMarks > 50 && studentMarks <= 70) {
			System.out.println("Second Class");
		} else {
			System.out.println("Fail");
		}
	}
}
