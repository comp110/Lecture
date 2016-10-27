package comp110.lecture17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import comp110.lecture08.Console;

// This is how our Costume Generator demo would work from last class if we were to use
// Java's standar library's abstract data type interfaces and implementations of a List.

public class CostumeGenerator2 {

  private static Console _userInput;

  public static void main(String[] args) {

    _userInput = new Console();

    System.out.println("Welcome to Halloween Costume Idea Generator 2.0\n");

    List<String> adjectives, nouns;

    adjectives = CostumeGenerator2.readFile("data/adjectives.txt");
    nouns = CostumeGenerator2.readFile("data/nouns.txt");
    CostumeGenerator2.generateIdeas(adjectives, nouns);

    System.out.println("Have fun! Be safe!");

  }

  public static List<String> readFile(String filename) {
    List<String> lines = new ArrayList<String>();

    TextFileReader file = new TextFileReader(filename);
    while (file.hasNext()) {
      String line = file.next();
      lines.add(line);
    }

    return lines;
  }

  public static void generateIdeas(List<String> adjectives, List<String> nouns) {
    String input = "";
    while (input.equals("exit") == false) {
      String randomAdjective = CostumeGenerator2.getRandom(adjectives);
      String randomNoun = CostumeGenerator2.getRandom(nouns);

      System.out.println("");
      System.out.println("You should be " + randomAdjective + " " + randomNoun);
      System.out.println("");
      System.out.println("Press enter to continue or type 'exit' to stop.");
      input = _userInput.askForAString();
    }
  }

  public static String getRandom(List<String> list) {
    Random random = new Random();
    return list.get(random.nextInt(list.size()));
  }

}
