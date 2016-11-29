package comp110.lecture25;

public class Mash {

	// Game Size Constants
	public static final int GROUPS = 4, OPTIONS = 4;

	// Group Index Constants
	public static final int HOUSE = 0, LOVER = 1, KIDS = 2, CAR = 3;

	private String[][] _options;

	public Mash() {
		_options = new String[GROUPS][OPTIONS];
		this.loadOptions();
	}

	public void loadOptions() {
		// We can assign the 2nd index directly
		_options[HOUSE][0] = "Mansion";
		_options[HOUSE][1] = "Apartment";
		_options[HOUSE][2] = "Shed";
		_options[HOUSE][3] = "House";

		// However, each outer element holds a 1D array of String values,
		// so we can assign an entire group just like we can a String[] array.
		_options[LOVER] = new String[] { "Niall", "Harry", "Zayn", "Louis" };
		_options[KIDS] = new String[] { "0 children", "1 child", "2 children", "3 children" };
		_options[CAR] = new String[] { "Minivan", "Prius", "Tesla", "Moped" };
	}

	public void crossOut(int group, int option) {
		// TODO: assign null to the element of _options at indices group, option
	}

	public boolean isOptionLeft(int group, int option) {
		// TODO: access the choice at indices group, option
		// and return true if it is not null, false otherwise
		return false;
	}

	public int optionsLeftInGroup(int group) {
		int count = 0;

		// Note here we're accessing just the outermost array.
		String[] optionsInGroup = _options[group];

		// TODO: use a for loop to iterate through optionsInGroup and
		// increment count IF an option is still left.
		// Hint: make use of the this.isOptionLeft method you just
		// implemented.

		return count;
	}

	public boolean isGameOver() {
		int totalLeft = 0;
		// Here we are summing the # of options left in all groups
		for (int group = 0; group < GROUPS; group++) {
			totalLeft += this.optionsLeftInGroup(group);
		}
		return totalLeft == 4;
	}

	public void play(int magicNumber) {
		int i = 0;
		int count = 0;
		while (this.isGameOver() == false) {
			// The following arithmetic will cycle through the grid
			// based on incrementing i. Why?
			int group = (i / OPTIONS) % GROUPS;
			int option = i % OPTIONS;

			// TODO:
			// 1. If the current option is left
			// and there is more than one option in this group
			// -- 2. Then: increment count
			// -- 3. Check to see if we've counted up to our magic number
			// ---- 4. If so, cross out that option

			i++;

			// TODO: delete this return
			return;
		}
	}

	public String toString() {
		if (this.isGameOver()) {
			String outcome = "\nYou are going to live in a " + this.getGroupOutcome(HOUSE) + ",\n";
			outcome += "you will drive a " + this.getGroupOutcome(CAR) + ",\n";
			outcome += "you will marry " + this.getGroupOutcome(LOVER) + ",\n";
			outcome += "and you will have " + this.getGroupOutcome(KIDS) + ".\n";
			return outcome;
		} else {
			return "You haven't played yet!";
		}
	}

	public String getGroupOutcome(int group) {
		// This helper method is used in the game over state. As such,
		// it simply returns the first non-null element value.
		for (String option : _options[group]) {
			if (option != null) {
				return option;
			}
		}
		// This should never happen, but Java doesn't know that!
		return "FAIL";
	}

}