package comp110.lecture23;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

//The extends keyword means "inherits from". This is an OOP concept
//covered fully in COMP401.
public class DidDukeWinApp extends Application {

  public static void main(String[] args) {
    // Wait... where is this launch method?!? It's a part of the Application
    // class DidDukeWinApp extends. Inheritance is awesome, powerful, and something to look
    // forward to in COMP401.
    DidDukeWinApp.launch(args);
  }

  public void start(Stage primaryStage) throws Exception {
    // The following is "boilerplate" code for loading a View file
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DidDukeWinView.fxml"));
    Parent view = fxmlLoader.load();

    Scene scene = new Scene(view, Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
    primaryStage.setTitle("Did Dook Win?");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

}
