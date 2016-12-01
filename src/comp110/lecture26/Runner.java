package comp110.lecture26;

import comp110.lecture07.Console;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Wecome to the COMP110 Autocompleter!!!");

		String[] words = TextFile.readLinesAndSort("data/words.txt");

		Autocompleter autocompleter;
		// TODO: Change the implementation of Autocompleter we use!
		autocompleter = new Lolcompleter();

		autocompleter.loadWords(words);
		System.out.println("Loaded dictionary of " + words.length + " words.");

		Console userInput = new Console();

		boolean hasntQuit = true;
		while (hasntQuit) {

			System.out.println("\nGive me a phrase to autocomplete.");
			String phrase = userInput.askForAString();

			if (phrase.equals("")) {
				hasntQuit = false;
			} else {

				autocompleter.resetStepCount();

				System.out.println("\nAutocompleted! You clearly meant to send...\n");
				System.out.println(" > " + Runner.predict(autocompleter, phrase));
				System.out.println("\n  ... in only " + autocompleter.getStepCount() + " steps.");

			}
		}
	}

	public static String predict(Autocompleter autocompleter, String phrase) {
		// Convert the phrase to lowercase and "split" it into an array of words
		String[] pieces = phrase.toLowerCase().split(" ");

		// Feed each word into the autocompleter and concatenate it to the output
		String output = "";
		for (String piece : pieces) {
			output += autocompleter.predict(piece.toLowerCase()) + " ";
		}

		// Return the output
		return output;
	}

}