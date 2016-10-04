package comp110.lecture12;

import java.util.Random;

public class Magic8Ball {

  private int _message;
  private Random _random;

  public Magic8Ball() {
    _message = 0;
    _random = new Random();
  }

  public void ask(String question) {
    System.out.println("... mysterious things happen ...");
  }

  public void shake() {
    System.out.println("... THE 8BALL IS SHAKEN WITH OPTIMISM ...");
    _message = _random.nextInt(5);
  }

  public String readAnswer() {
    if (_message == 0) {
      return "Yes, definitely.";
    } else {
      if (_message == 1) {
        return "It is decidedly so.";
      } else {
        if (_message == 2) {
          return "Reply hazy, try again.";
        } else {
          if (_message == 3) {
            return "Concentrate and ask again.";
          } else {
            return "Outlook not so good.";
          }
        }
      }
    }
  }

}