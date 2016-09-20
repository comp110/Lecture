package comp110.lecture08;

public class DateCalculator {

  /* Instance Variables */
  private String _potentialBae;
  private int _lookedAtPhoneCount;
  private double _craziness;
  private double _attractiveness;
  private boolean _broughtFriends;

  /* Constructor */
  public DateCalculator(String potentialBae) {
    _potentialBae = potentialBae;
    _lookedAtPhoneCount = 0;
    _attractiveness = 0.0;
    _craziness = 0.0;
    _broughtFriends = false;
  }

  /* Setter Methods */
  public void setLookedAtPhoneCount(int times) {
    _lookedAtPhoneCount = times;
  }

  public void setBroughtFriends(boolean broughtFriends) {
    _broughtFriends = broughtFriends;
  }

  public void setAttractiveness(double attractiveness) {
    _attractiveness = attractiveness;
  }

  public void setCraziness(double craziness) {
    _craziness = craziness;
  }

  public double crazyHotRatio() {
    return _attractiveness / _craziness;
  }

  /* Methods */

  public int score() {
    int points = 0;

    // TODO: Implement scoring criteria

    return points;
  }

  public String prediction() {
    int points = this.score();

    // TODO: Implement this method.

    return "???";
  }

}