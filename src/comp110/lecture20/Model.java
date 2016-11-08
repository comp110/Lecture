package comp110.lecture20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Model {

  private Set<State> _states;
  private List<Simulation> _simulations;

  public Model(Set<State> states) {
    _states = states;
    _simulations = new ArrayList<Simulation>();
  }

  public void simulate(int n) {
    _simulations = new ArrayList<Simulation>();
    // TODO
  }

  public Map<String, Integer> countOutcomes() {
    Map<String, Integer> outcomes = new HashMap<String, Integer>();
    for (Simulation simulation : _simulations) {
      String outcome = simulation.toString();
      if (outcomes.containsKey(outcome)) {
        outcomes.put(outcome, outcomes.get(outcome) + 1);
      } else {
        outcomes.put(outcome, 1);
      }
    }
    return outcomes;
  }

  public void histogram() {
    Map<String, Integer> frequencies = this.countOutcomes();

    List<String> outcomes = new ArrayList<String>(frequencies.keySet());
    outcomes.sort(String.CASE_INSENSITIVE_ORDER);

    for (String outcome : outcomes) {
      int frequency = frequencies.get(outcome);
      String bar = "";
      // TODO
      System.out.println(outcome + " " + bar);
    }
  }

  public double averageRedEVs() {
    double n = (double) _simulations.size();
    int votes = 0;
    for (Simulation s : _simulations) {
      votes += s.redEV();
    }
    return votes / n;
  }

  public double averageBlueEVs() {
    double n = (double) _simulations.size();
    int votes = 0;
    // TODO
    return votes / n;
  }

  public List<Simulation> filterRedWins() {
    List<Simulation> redWins = new ArrayList<Simulation>();
    for (Simulation s : _simulations) {
      if (s.redEV() > s.blueEV()) {
        redWins.add(s);
      }
    }
    return redWins;
  }

  public List<Simulation> filterBlueWins() {
    List<Simulation> blueWins = new ArrayList<Simulation>();
    // TODO
    return blueWins;
  }

  public void printOutcome() {
    this.histogram();

    System.out.println("Red EVs:" + this.averageRedEVs());
    System.out.println("Blue EVs: " + this.averageBlueEVs());

    double n = (double) _simulations.size();
    System.out.println("Red %: " + (this.filterRedWins().size() / n));
    System.out.println("Blue %: " + (this.filterBlueWins().size() / n));

  }

}