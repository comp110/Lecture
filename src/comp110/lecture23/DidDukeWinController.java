package comp110.lecture23;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class DidDukeWinController {

  // The weird looking thing below is an "annotation". 
  // Annotations are a bit magical, but it ultimately causes
  // the following instance variables to be "bound" with
  // their respective Label controls when the FXML loads.
  @FXML
  private Label _result;

  // initialize is a special method called by JavaFX after
  // it hooks up the controls above.
  public void initialize() {
    System.out.println("Controller initialized!");
  }

  public void handleClickButton(ActionEvent event) {
    System.out.println("Button clicked!");
    // TODO
  }

}