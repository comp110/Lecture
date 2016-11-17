package comp110.lecture23;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question {

  private String _prompt;
  private Map<String, String> _answers;

  public Question(String prompt) {
    _prompt = prompt;
    _answers = new HashMap<String, String>();
  }

  public void addChoice(String choice, String result) {
    _answers.put(choice, result);
  }

  public String getPrompt() {
    return _prompt;
  }

  public Set<String> getChoices() {
    return _answers.keySet();
  }

  public String getResult(String choice) {
    return _answers.get(choice);
  }

}