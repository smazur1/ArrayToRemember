import java.util.Scanner;

public class ArrayToRemember {

	public static void main(String[] args) {

		String[] presidents = new String[44];
		String name, nameCheck;
		boolean atLeastOne = false;
		int arrayCount = 0;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter President : ");

		name = keyboard.next();
		nameCheck = name.toLowerCase();

		while ((!nameCheck.equals("history")) && (arrayCount < 44)) {

			atLeastOne = true;
			presidents[arrayCount] = name;

			System.out.println("Enter President : ");
			name = keyboard.next();
			nameCheck = name.toLowerCase();

			arrayCount++;

		} // End While

		if (atLeastOne == true) {
			for (int i = arrayCount - 1; i >= 0; i--) {
				System.out.println(presidents[i]);
			}
		}

		keyboard.close();

	}
}
