package comp110.lecture20;

import java.util.Set;

public class ModelRunner {

  public static void main(String[] args) {

    Set<State> states = SimulationRunner.readStateData("data/state-probabilities.txt");

    Model simulator = new Model(states);
    simulator.simulate(10);
    simulator.printOutcome();

  }

}