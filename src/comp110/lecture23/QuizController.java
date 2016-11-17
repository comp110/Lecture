package comp110.lecture23;

import java.util.Set;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class QuizController {

  // The weird looking thing below is an "annotation". 
  // Annotations are a bit magical, but it ultimately causes
  // the following instance variables to be "bound" with
  // their respective Label controls when the FXML loads.
  @FXML
  private Label _prompt, _a, _b, _c, _d, _e;
  private Label[] _choices;

  // Instance variables to hold our "model" data
  private QuizModel _quiz;
  private Question _question;

  // initialize is a special method called by JavaFX after
  // it hooks up the controls above.
  public void initialize() {
    _choices = new Label[] { _a, _b, _c, _d, _e };
  }

  public void setQuiz(QuizModel quiz) {
    _quiz = quiz;
    this.nextQuestion();
  }

  public void reset() {
    _quiz.reset();
    this.nextQuestion();
  }

  public void nextQuestion() {
    // Does the QuizModel have another question?
    if (_quiz.hasNext()) {

      // Ask the QuizModel for the next Question
      _question = _quiz.next();

      // TODO: Set prompt text

      // TODO: Set choices text

    } else {

      // We're done with the quiz!
      Alert alert = new Alert(AlertType.INFORMATION);
      alert.setTitle("Your Scientific Results");
      alert.setHeaderText("You are " + _quiz.getResult() + "!!!");
      alert.setContentText("Press OK to try again.");
      alert.showAndWait();
      this.reset();

    }
  }

  public void handleClickA(MouseEvent e) {
    // TODO: handle clicking the first choice Label
  }

  public void handleClickB(MouseEvent e) {
    String choice = _b.getText();
    String result = _question.getResult(choice);
    _quiz.addTally(result);
    this.nextQuestion();
  }

  public void handleClickC(MouseEvent e) {
    String choice = _c.getText();
    String result = _question.getResult(choice);
    _quiz.addTally(result);
    this.nextQuestion();
  }

  public void handleClickD(MouseEvent e) {
    String choice = _d.getText();
    String result = _question.getResult(choice);
    _quiz.addTally(result);
    this.nextQuestion();
  }

  public void handleClickE(MouseEvent e) {
    String choice = _e.getText();
    String result = _question.getResult(choice);
    _quiz.addTally(result);
    this.nextQuestion();
  }

}
