package comp110.lecture20;

public class State {

  private String _state;
  private int _electoralVotes;
  private double _redProbability;
  private double _simulation;

  public State(String state, int electoralVotes, double redProbability) {
    _state = state;
    _electoralVotes = electoralVotes;
    _redProbability = redProbability;
    _simulation = 0.0;
  }

  public void simulate() {
    // TODO
  }

  public int redEV() {
    if (_simulation < _redProbability) {
      return _electoralVotes;
    } else {
      return 0;
    }
  }

  public int blueEV() {
    if (_simulation >= _redProbability) {
      return _electoralVotes;
    } else {
      return 0;
    }
  }

  public State clone() {
    return new State(_state, _electoralVotes, _redProbability);
  }

  public String toString() {
    return _state + " R:" + this.redEV() + " B:" + this.blueEV();
  }

}
