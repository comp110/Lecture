package comp110.lecture26;

public interface Autocompleter {

	public void loadWords(String[] words);

	public String predict(String word);

	public int getStepCount();

	public void resetStepCount();

}