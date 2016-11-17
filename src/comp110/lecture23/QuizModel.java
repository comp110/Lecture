package comp110.lecture23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuizModel {

  private String _title;
  private List<Question> _questions;

  private int _index;
  private Map<String, Integer> _scores;

  public QuizModel(String title) {
    _title = title;
    _questions = new ArrayList<Question>();
    _scores = new HashMap<String, Integer>();
    _index = 0;
  }

  public void reset() {
    _index = 0;
    for (String key : _scores.keySet()) {
      _scores.put(key, 0);
    }
  }

  public void addQuestion(Question question) {
    _questions.add(question);
  }

  public boolean hasNext() {
    return _index < _questions.size();
  }

  public Question next() {
    Question question = _questions.get(_index);
    _index++;
    return question;
  }

  public String getResult() {
    // TODO: Fix this logic!
    return "Ursula";
  }

  public void addOutcome(String outcome) {
    _scores.put(outcome, 0);
  }

  public void addTally(String outcome) {
    _scores.put(outcome, _scores.get(outcome) + 1);
  }

  public String toString() {
    return _scores.toString();
  }

}
