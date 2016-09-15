package comp110.lecture07;

import java.util.Scanner;

/**
 * The purpose of this little class is to make it simple to ask the user for
 * input in the Console window.
 * 
 * You do not need to understand the java.util.Scanner class or other weird
 * looking things being used here. If you are a comp sci major, AFTER lecture
 * completes, feel free to tinker and/or read more on these things.
 * 
 * @author Kris
 */
public class Console {

  /* Instance Variables */
  private Scanner _scanner;

  /* Constructor */
  public Console() {
    _scanner = new Scanner(System.in);
  }

  /* Methods */
  public String askForAString() {
    System.out.print("Enter a String (no quotes): ");
    return _scanner.nextLine();
  }

  public int askForAnInt() {
    System.out.print("Enter an int: ");
    return Integer.parseInt(_scanner.nextLine());
  }

  public double askForADouble() {
    System.out.print("Enter a double: ");
    return Double.parseDouble(_scanner.nextLine());
  }

  public boolean askForABoolean() {
    System.out.print("Enter a boolean: ");
    return Boolean.parseBoolean(_scanner.nextLine());
  }

}