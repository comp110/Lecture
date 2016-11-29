package comp110.lecture25;

import comp110.lecture08.Console;

public class MashRunner {

  public static void main(String[] args) {

    System.out.println("Welcome to M.A.S.H. - are you ready to know your future?");

    Console userInput = new Console();

    System.out.println("Press enter and I'll pick your magic number.");
    userInput.askForAString();

    // The way the following expression evaluates is:
    // 1. Multiply a random double between 0.0 and 0.99 with 10.0
    // 2. Convert that double to an integer which makes it between 0 and 9
    // 3. Add 2 so that our magic number is always at least 2
    int magicNumber = (int) (Math.random() * 10.0) + 2;
    System.out.println("Your magic number is " + magicNumber);

    System.out.println("Press enter and I'll tell you your future.");
    userInput.askForAString();

    Mash mash = new Mash();
    mash.play(magicNumber);
    System.out.println(mash);

    System.out.println("<3 <3 <3 <3 <3 <3 <3");

  }

}
