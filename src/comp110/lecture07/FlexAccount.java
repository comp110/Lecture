package comp110.lecture07;

public class FlexAccount {

  private double _balance;

  public FlexAccount() {
    System.out.println(" => FlexAccount constructor called");
    _balance = 0.0;
  }

  public void deposit(double amount) {
    System.out.println(" => deposit called with amount: " + amount);
    _balance = _balance + amount;
  }

  public void withdraw(double amount) {
    System.out.println(" => withdraw called with amount: " + amount);

    _balance = _balance - amount;

    // Late Penalty Applied
    if (_balance < 0.0) {
      _balance = _balance - 20.0;
    }

  }

  public double getBalance() {
    System.out.println(" => getBalance called");
    return _balance;
  }

}
