package comp110.lecture26;

public class BinarySearchAutocomplete implements Autocompleter {

	private String[] _words;
	private int _steps;

	public void loadWords(String[] words) {
		_words = words;
		_steps = 0;
	}

	public String predict(String word) {
		int left, right, guess;

		left = 0;
		right = _words.length - 1;

		while (left <= right) { // Why this condition?
			_steps++;

			// Step 0. Remove this return
			return word;

			// Step 1. Update guess index

			// Step 2. Check to see if the guessed index
			// starts with the word parameter. If so
			// return the word at the guessed index.

			// Step 3. Use String's compareTo method
			// to compare the word at the guessed index with the word.
			// 3.A) If result is less than 0, set left to guess + 1
			// 3.B) If the result is greater than 0, set right to guess - 1

		}

		// No match found? Return word.
		return word;
	}

	public int getStepCount() {
		return _steps;
	}

	public void resetStepCount() {
		_steps = 0;
	}

}
