package comp110.lecture23;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

// The extends keyword means "inherits from". This is an OOP concept
// covered fully in COMP401.
public class QuizApp extends Application {

  public static void main(String[] args) {
    // Wait... where is this launch method?!? It's a part of the Application
    // class CompQuiz extends. Inheritance is awesome, powerful, and something to look
    // forward to in COMP401.
    QuizApp.launch(args);
  }

  public void start(Stage stage) throws Exception {

    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("QuizView.fxml"));
    Parent view = fxmlLoader.load();
    QuizController controller = (QuizController) fxmlLoader.getController();
    controller.setQuiz(this.initializeQuiz());

    Scene scene = new Scene(view, Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
    stage.setTitle("COMPFeed Quiz");
    stage.setScene(scene);
    stage.show();

  }

  public QuizModel initializeQuiz() {
    QuizModel model = new QuizModel("Which Disney princess are you?");

    model.addOutcome("Tiana");
    model.addOutcome("Ariel");
    model.addOutcome("Belle");
    model.addOutcome("Jasmine");
    model.addOutcome("Rapunzel");

    Question q0 = new Question("What is your favorite kind of pet?");
    q0.addChoice("Frog", "Tiana");
    q0.addChoice("Cats", "Jasmine");
    q0.addChoice("Plates", "Belle");
    q0.addChoice("Fish", "Ariel");
    q0.addChoice("Chameleon", "Rapunzel");
    model.addQuestion(q0);

    Question q1 = new Question("What is your favorite color?");
    q1.addChoice("Red", "Ariel");
    q1.addChoice("Blue", "Jasmine");
    q1.addChoice("Green", "Tiana");
    q1.addChoice("Yellow", "Belle");
    q1.addChoice("Purple", "Rapunzel");
    model.addQuestion(q1);

    Question q2 = new Question("What is your favorite hobby?");
    q2.addChoice("Singing", "Ariel");
    q2.addChoice("Travel", "Jasmine");
    q2.addChoice("Cooking", "Tiana");
    q2.addChoice("Reading", "Belle");
    q2.addChoice("Drawing", "Rapunzel");
    model.addQuestion(q2);

    Question q3 = new Question("What kind of lover do you prefer?");
    q3.addChoice("One With Legs", "Ariel");
    q3.addChoice("Street Rats", "Jasmine");
    q3.addChoice("Princes", "Tiana");
    q3.addChoice("Bearded", "Belle");
    q3.addChoice("Wanted Criminals", "Rapunzel");
    model.addQuestion(q3);

    Question q4 = new Question("Where do you want to live?");
    q4.addChoice("By the Ocean", "Ariel");
    q4.addChoice("In the Desert", "Jasmine");
    q4.addChoice("New Orleans", "Tiana");
    q4.addChoice("Mountains", "Belle");
    q4.addChoice("Forrest", "Rapunzel");
    model.addQuestion(q4);

    return model;
  }

}
