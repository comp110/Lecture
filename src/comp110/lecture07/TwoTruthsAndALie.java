package comp110.lecture07;

public class TwoTruthsAndALie {

  public static void main(String[] args) {

    Console userInput = new Console();

    System.out.println("Which of these is a lie?");
    System.out.println("1. ");
    System.out.println("2. ");
    System.out.println("3. ");

    int guess = userInput.askForAnInt();
    System.out.println("You guessed #" + guess);

    // TODO: Implement if-then statement below this line

    System.out.println("Game over.");

  }

}
