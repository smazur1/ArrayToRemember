
import java.util.Scanner;

public class PresidentsBubbleSort {

	public static void main(String[] args) {

		String[] presidents = new String[44];
		String name, nameCheck, temp;
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

		// Swap the values around to put them ascending order.

		for (int i = 0; i < arrayCount; i++) {
			for (int j = 0; j < arrayCount - 1; j++) {
				if (presidents[j].compareToIgnoreCase(presidents[j + 1]) > 0) {

					// swap the values in two slots
					temp = presidents[j];
					presidents[j] = presidents[j + 1];
					presidents[j + 1] = temp;
				}
			}
		}

		if (atLeastOne == true) {
			for (int i = 0; i <= arrayCount - 1; i++) {
				System.out.println(presidents[i]);
			}
		}

		keyboard.close();

	}
}
