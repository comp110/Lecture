package comp110.lecture08;

public class LogicalOperatorExamples {

  public static void main(String[] args) {

    Console userInput = new Console();
    System.out.println("What is a's initial value?");
    boolean a = userInput.askForABoolean();
    System.out.println("What is b's initial value?");
    boolean b = userInput.askForABoolean();

    System.out.println("");
    System.out.println("&& - The AND operator.");
    System.out.println(a + " && " + b + " is " + (a && b));

    System.out.println("");
    System.out.println("|| - The OR operator.");
    System.out.println(a + " || " + b + " is " + (a || b));

    System.out.println("");
    System.out.println("!  - The NOT operator.");
    System.out.println("!" + a + " is " + !a);
    System.out.println("!" + b + " is " + !a);

  }

}
