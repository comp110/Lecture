package comp110.lecture27;

import comp110.lecture08.Console;

public class EndGame {

	public static void main(String[] args) {

		System.out.println("COMP110 Conceptual Review Game");

		ConceptBank bank = new ConceptBank();
		Console userInput = new Console();
		boolean quit = false;

		while (quit == false) {
			System.out.println("\nHow many concepts do you want to relate? 0 to quit.");
			int numberOfWords = userInput.askForAnInt();

			if (numberOfWords > 0) {
				System.out.println("\nRelate these words:\n");
				// System.out.println(bank.getRandomWordSet(numberOfWords));
				System.out.println("\nPress enter to continue.");
				userInput.askForAString();
			} else {
				quit = true;
			}
		}

		System.out.println("\n\nGood luck on the final!!! <3 Kris and the COMP110 Team");

	}
}