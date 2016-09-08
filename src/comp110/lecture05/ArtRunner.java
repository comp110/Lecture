package comp110.lecture05;

import comp110.AutoGUI;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class ArtRunner {

  public static void main(String[] args) {

    Group scene = new Group();

    Door door = new Door();
    // TODO: call setters for handle size and paint properties

    scene.getChildren().add(door.shapes(0.0, 0.0));

    new AutoGUI(scene);

  }

}
