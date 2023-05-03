package Loops;

public class tripleforloop {
public static void main(String[] args)
{
	for (int i = 0; i <= 4; i++) {// inner loop
		for (int j = 0; j <= i; j++) {
			for (int k = 0; k <= j; k++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");// goes to next line
		}

	}
}
}




