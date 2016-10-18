package comp110.lecture15;

public class Egg {

  private boolean _isRaw;
  private boolean _isCracked;

  public Egg() {
    _isRaw = true;
    _isCracked = false;
  }

  public void hardBoil() {
    _isRaw = false;
  }

  public void crackOnHead() {
    System.out.println("\n");
    if (_isCracked) {
      System.out.println("You can't crack an egg twice!");
    } else {
      _isCracked = true;
      if (_isRaw) {
        System.out.println("You picked a RAW egg :(");
      } else {
        System.out.println("You picked a hard-boiled egg :)");
      }
    }
    System.out.println("\n");
  }

  public boolean isRaw() {
    return _isRaw;
  }

  public String toString() {
    if (_isRaw) {
      return "A raw egg.";
    } else {
      return "A hard-boiled egg.";
    }
  }

}