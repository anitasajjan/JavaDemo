package Loops;

public class forinsideforloop {
	public static void main(String[] args) // outer loop
	{
		for (int i = 0; i <= 4; i++) // inner loop
		{
			for (int j = 0; j <= i; j++) {

				System.out.print("*" + " ");
			}
			System.out.println();// goes to next line
		}

	}
}
