package comp110.lecture25;

public class MashTests {

	public static void main(String[] args) {

		Mash mash = new Mash();

		// TODO Hands-on #1
		System.out.println("Hands-on #1");
		System.out.println("isOptionLeft expects: true - actual: " + mash.isOptionLeft(Mash.LOVER, 2));
		mash.crossOut(Mash.LOVER, 2);
		System.out.println("isOptionLeft expects: false - actual: " + mash.isOptionLeft(Mash.LOVER, 2));

		// TODO Hands-on #2
		System.out.println("Hands-on #2");
		System.out.println("optionsLeftInGroup expects: 4 - actual: " + mash.optionsLeftInGroup(Mash.HOUSE));
		System.out.println("optionsLeftInGroup expects: 3 - actual: " + mash.optionsLeftInGroup(Mash.LOVER));

	}

}
