package comp110.lecture26;

public class Lolcompleter implements Autocompleter {

	private int _steps;

	public Lolcompleter() {
		_steps = 0;
	}

	public void loadWords(String[] dictionary) {
		// ... nah ...
	}

	public String predict(String word) {
		_steps++;
		return "lol";
	}

	public int getStepCount() {
		return _steps;
	}

	public void resetStepCount() {
		_steps = 0;
	}

}