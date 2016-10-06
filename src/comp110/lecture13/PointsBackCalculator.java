package comp110.lecture13;

import comp110.lecture08.Console;

public class PointsBackCalculator {

  public static void main(String[] args) {

    Console userInput = new Console();

    boolean isRunning = true;

    while (isRunning) {
      System.out.println("How many points on the original problem? [0-10]");
      int originalPoints = userInput.askForAnInt();

      System.out.println("How many points on the retry problem? [0-10]");
      int retryPoints = userInput.askForAnInt();

      if (originalPoints < 0 || originalPoints > 10 || retryPoints < 0 || retryPoints > 10) {
        System.out.println("Invalid input.");
      } else {

        if (originalPoints >= retryPoints) {
          System.out.println("You'll keep same points: " + originalPoints);
        } else {
          int difference = retryPoints - originalPoints;
          if (difference > 8) {
            difference = 8;
          }
          int newPoints = originalPoints + difference;
          System.out.println("Your replacement score is " + newPoints);
        }

      }

      System.out.println("Enter 0 to quit, 1 to continue");
      isRunning = userInput.askForAnInt() != 0;
    }

    System.out.println("God speed studying and practicing!");

  }

}
