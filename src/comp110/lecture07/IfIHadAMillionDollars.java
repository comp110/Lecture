package comp110.lecture07;

public class IfIHadAMillionDollars {

  public static void main(String[] args) {

    Console userInput = new Console();

    FlexAccount anAccount = new FlexAccount();

    System.out.println("How much do you want to deposit?");
    anAccount.deposit(userInput.askForADouble());

    System.out.println("Your current balance is " + anAccount.getBalance());

    // TODO: if anAccount has 1000000 or more, print what you would buy.
    //       else print a sad face and / or message

  }

}
