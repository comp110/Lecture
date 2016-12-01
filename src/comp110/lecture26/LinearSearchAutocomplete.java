package comp110.lecture26;

public class LinearSearchAutocomplete implements Autocompleter {

	private String[] _words;
	private int _steps;

	public LinearSearchAutocomplete() {
		_words = new String[0];
		_steps = 0;
	}

	public void loadWords(String[] words) {
		_words = words;
	}

	public String predict(String word) {

		// 1. Write a for loop that begins with the last index in _words.
		// It should stop looping when its counter variable is less than 0.
		//
		// Inside of the loop:
		// 2. Increment _steps instance variable counter by 1
		// 3. If the String at the current index *startsWith* the word parameter,
		// return word.
		//
		// After the loop:
		// 4. Return the word parameter. Why?

		return "Replace me with step 4.";
	}

	public int getStepCount() {
		return _steps;
	}

	public void resetStepCount() {
		_steps = 0;
	}

}
