package comp110.lecture20;

import java.util.HashSet;
import java.util.Set;

public class Simulation {

  private Set<State> _states;
  private int _red, _blue;

  public Simulation(Set<State> states) {
    _red = 0;
    _blue = 0;

    // Clone states into a new Set of states. Why?
    _states = new HashSet<State>();
    for (State state : states) {
      _states.add(state.clone());
    }
  }

  public void simulate() {
    // TODO
  }

  public int redEV() {
    return _red;
  }

  public int blueEV() {
    return _blue;
  }

  public String toString() {
    return "R:" + _red + " B:" + _blue;
  }

}