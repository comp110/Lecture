package comp110.lecture05;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;

// Home Exercise: Try reading through this code!

public class Window {

  private double _width;
  private double _height;

  public Window(double width, double height) {
    _width = width;
    _height = height;
  }

  public Group shapes(double x, double y) {
    Group aGroup = new Group();

    aGroup.getChildren().add(this.pane());
    aGroup.getChildren().add(this.verticalBar());
    aGroup.getChildren().add(this.horizontalBar());
    aGroup.setTranslateX(x);
    aGroup.setTranslateY(y);

    return aGroup;
  }

  public Rectangle pane() {
    Rectangle pane = new Rectangle();
    pane.setFill(Color.DODGERBLUE);
    pane.setStroke(Color.BLACK);
    pane.setStrokeWidth(1.0);
    pane.setHeight(_height);
    pane.setWidth(_width);
    return pane;
  }

  public Path verticalBar() {
    Path verticalBar = new Path();
    verticalBar.setStroke(Color.BLACK);
    verticalBar.setStrokeWidth(1.0);

    MoveTo start = new MoveTo();
    start.setX(_width / 2.0);
    start.setY(0.0);
    verticalBar.getElements().add(start);

    LineTo end = new LineTo();
    end.setX(_width / 2.0);
    end.setY(_height);
    verticalBar.getElements().add(end);

    return verticalBar;
  }

  public Path horizontalBar() {
    Path horizontalBar = new Path();
    horizontalBar.setStroke(Color.BLACK);
    horizontalBar.setStrokeWidth(1.0);

    MoveTo start = new MoveTo();
    start.setX(0.0);
    start.setY(_height / 2.0);
    horizontalBar.getElements().add(start);

    LineTo end = new LineTo();
    end.setX(_width);
    end.setY(_height / 2.0);
    horizontalBar.getElements().add(end);

    return horizontalBar;
  }

}
