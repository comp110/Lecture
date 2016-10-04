package comp110.lecture12;

import comp110.lecture08.Console;

public class Magic8BallRunner {

  public static void main(String[] args) {

    Console userInput = new Console();
    Magic8Ball an8Ball = new Magic8Ball();

    System.out.println("Ask the Magic 8 Ball a yes/no question...");
    String question = userInput.askForAString();

    an8Ball.ask(question);
    an8Ball.shake();

    System.out.println("=====================");
    System.out.println("  The 8 Ball Says... ");
    System.out.println(an8Ball.readAnswer());
    System.out.println("=====================");

  }

}