package comp110.lecture08;

public class LoverPredictionApp {

  public static void main(String[] args) {

    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("          Welcome to Bae.I.           ");
    System.out.println("  COMP110's Artificially Intelligent  ");
    System.out.println("       Lover Prediction App           ");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("");

    Console userInput = new Console();

    System.out.println("1. What was your date's name?");
    String name = userInput.askForAString();
    DateCalculator baeCalc = new DateCalculator(name);

    System.out.println("2. How many times did your date look at their phone?");
    baeCalc.setLookedAtPhoneCount(userInput.askForAnInt());

    System.out.println("3. Your date brought a friend? true or false");
    baeCalc.setBroughtFriends(userInput.askForABoolean());

    System.out.println("4. How attractive did you find your date? (0.0 to 1.0)");
    baeCalc.setAttractiveness(userInput.askForADouble());

    System.out.println("5. How crazy did you find your date? (0.0 to 1.0)");
    baeCalc.setCraziness(userInput.askForADouble());

    System.out.println("");
    System.out.println("===== CALCULATING RESULTS =====");
    System.out.println(".....  bleep bloop bleep  .....");
    System.out.println("WITH NEARLY 99.999% UNCERTAINTY:");
    System.out.println("");
    System.out.println("Your date score is: " + baeCalc.score());
    System.out.println("");
    System.out.println(baeCalc.prediction());

  }

}
