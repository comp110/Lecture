package comp110.lecture16;

import comp110.lecture08.Console;

public class CostumeGenerator {

  // Shield your eyes folks... a static variable! We won't cover these. They're
  // rarely useful when you want to share a variable across static methods.
  private static Console _userInput;

  public static void main(String[] args) {

    _userInput = new Console();

    System.out.println("Welcome to the Halloween Costume Idea Generator\n");

    StringList adjectives, nouns;
    adjectives = CostumeGenerator.getAdjectives();
    nouns = CostumeGenerator.getNouns();
    CostumeGenerator.generateIdeas(adjectives, nouns);

    System.out.println("Have fun! Be safe!");

  }

  public static StringList getAdjectives() {

    // Notice we don't know nor really care how many adjectives
    // we add to our StringList!
    StringList adjectives = new StringList();
    adjectives.add("Scary");
    adjectives.add("Cute");
    adjectives.add("Creepy");
    adjectives.add("Cuddly");
    adjectives.add("Ratchet");
    adjectives.add("Nerdy");

    boolean adding = true;
    while (adding) {
      System.out.println("Add an adjective or press enter to continue.");
      String input = _userInput.askForAString();
      if (input.equals("")) {
        adding = false;
      } else {
        adjectives.add(input);
      }
    }

    return adjectives;
  }

  public static StringList getNouns() {

    // Notice we don't know nor really care how many nouns
    // we add to our StringList!
    StringList nouns = new StringList();
    nouns.add("Harambae");
    nouns.add("Trump");
    nouns.add("Hillary");
    nouns.add("Carol Folt");
    nouns.add("Pokemon Trainer");
    nouns.add("CPU Hat");
    nouns.add("Bill Gates");
    nouns.add("Cherie Berry");

    boolean adding = true;
    while (adding) {
      System.out.println("Add a noun or press enter to continue.");
      String input = _userInput.askForAString();
      if (input.equals("")) {
        adding = false;
      } else {
        nouns.add(input);
      }
    }

    return nouns;
  }

  public static void generateIdeas(StringList adjectives, StringList nouns) {
    String input = "";
    while (input.equals("exit") == false) {
      System.out.println("");
      System.out.println("You should be " + adjectives.getRandom() + " " + nouns.getRandom());
      System.out.println("");
      System.out.println("Press enter to continue or type 'exit' to stop.");
      input = _userInput.askForAString();
    }
  }

}
