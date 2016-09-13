package comp110.lecture06;

public class FlexAccount {

  private double _balance;

  public FlexAccount() {
    _balance = 100.0;
  }

  public void deposit(double amount) {
    _balance = _balance + amount;
  }

  public void withdraw(double amount) {
    _balance = _balance - amount;
  }

  public double getBalance() {
    return _balance;
  }

}
