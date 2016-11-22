package comp110.lecture24;

import comp110.AutoGUI;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RecursiveDrawing {

  public static void main(String[] args) {
    // We're constructing a new instance of RecursiveDrawing
    // inside of the same class! Using a type recursively...
    RecursiveDrawing instance = new RecursiveDrawing();
    AutoGUI ui = new AutoGUI(instance);
  }

  // Use method call recursion to draw a spiral
  public Group spiral(double width) {
    Group group = new Group();

    Rectangle square = new Rectangle();
    square.setWidth(width);
    square.setHeight(width);
    square.setX(50.0);
    square.setY(width * 10.0); // Notice!
    square.setFill(new Color(0.0, 0.0, 0.0, 1.0));
    group.getChildren().add(square);

    // TODO: Add Recursive Step

    return group;
  }

}
