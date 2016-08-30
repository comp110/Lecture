/**
 * This is the runner for the Calculator demo. You should not modify it.
 */
package comp110.lecture02;

// We need to import the AutoGUI
import comp110.AutoGUI;

public class CalculatorRunner {

  // The main Method is where every Java program begins
  public static void main(String[] args) {

    // Construct a Calculator
    Calculator ti83 = new Calculator();

    // Display an automatic Graphical User Interface for it
    new AutoGUI(ti83);

  }

}