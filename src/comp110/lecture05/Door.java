package comp110.lecture05;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Door {

  /* Methods */
  public Group shapes(double x, double y) {
    Group aGroup = new Group();

    aGroup.getChildren().add(this.wood());
    aGroup.getChildren().add(this.handle());

    // Translate "move" the entire group of shapes by parameters x, y
    aGroup.setTranslateX(x);
    aGroup.setTranslateY(y);

    return aGroup;
  }

  public Rectangle wood() {
    Rectangle wood = new Rectangle();
    wood.setHeight(40.0);
    wood.setWidth(20.0);
    wood.setFill(Color.BROWN);
    return wood;
  }

  public Circle handle() {
    Circle handle = new Circle();
    handle.setRadius(2.5);
    handle.setFill(Color.BLACK);
    handle.setCenterX(16.0);
    handle.setCenterY(20.0);
    return handle;
  }

}