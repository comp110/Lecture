package comp110.lecture20;

import java.io.FileReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class SimulationRunner {

  public static void main(String[] args) {

    Set<State> states = SimulationRunner.readStateData("data/state-probabilities.txt");

    // TODO

  }

  public static Set<State> readStateData(String path) {
    Set<State> states = new HashSet<State>();

    try {
      Reader in = new FileReader(path);
      CSVParser records = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(in);
      for (CSVRecord record : records) {
        String state = record.get("state");
        int electoralVotes = Integer.parseInt(record.get("ev"));
        double trumpProbability = Double.parseDouble(record.get("red"));
        states.add(new State(state, electoralVotes, trumpProbability));
      }
    } catch (Exception e) {
      throw new Error("An error was encountered reading the CSV file.");
    }

    return states;
  }

}