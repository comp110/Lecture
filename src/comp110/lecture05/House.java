package comp110.lecture05;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.ClosePath;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class House {

  /* Instance Variables */
  private Window _leftWindow;
  private Window _rightWindow;
  private Color _paint;
  // TODO: declare a Door instance variable

  /* Constructor */
  public House() {
    _paint = Color.WHITE;
    _leftWindow = new Window(20.0, 20.0);
    _rightWindow = new Window(20.0, 20.0);
    // TODO: initialize the _door instance variable
  }

  /* Methods */
  public Group shapes(double x, double y) {
    Group aGroup = new Group();

    aGroup.getChildren().add(this.houseShape());

    // Add the sub components of a house
    aGroup.getChildren().add(_leftWindow.shapes(10.0, 50.0));
    aGroup.getChildren().add(_rightWindow.shapes(70.0, 50.0));

    // TODO: add the door's shapes to the house's shapes
    // aGroup.getChildren().add(_door.shapes(40.0, 50.0));

    aGroup.setTranslateX(x);
    aGroup.setTranslateY(y);
    return aGroup;
  }

  public Path houseShape() {
    Path housePath = new Path();
    housePath.setStroke(Color.BLACK);
    housePath.setFill(_paint);
    housePath.setStrokeWidth(2.0);

    // Move the starting point to 20.0, 100.0
    MoveTo start = new MoveTo();
    start.setX(0.0);
    start.setY(90.0);
    housePath.getElements().add(start);

    // Draw the bottom line to the right corner
    LineTo bottomRight = new LineTo();
    bottomRight.setX(100.0);
    bottomRight.setY(90.0);
    housePath.getElements().add(bottomRight);

    // Draw line up to top right corner
    LineTo topRight = new LineTo();
    topRight.setX(100.0);
    topRight.setY(40.0);
    housePath.getElements().add(topRight);

    // Draw line up to top center of roof
    LineTo topCenter = new LineTo();
    topCenter.setX(50.0);
    topCenter.setY(0.0);
    housePath.getElements().add(topCenter);

    // Draw Line to left top corner
    LineTo topLeft = new LineTo();
    topLeft.setX(0.0);
    topLeft.setY(40.0);
    housePath.getElements().add(topLeft);

    // Close Path
    ClosePath closePath = new ClosePath();
    housePath.getElements().add(closePath);

    return housePath;
  }

  /* Accessor Methods */
  public Color getPaint() {
    return _paint;
  }

  public void setPaint(Color paint) {
    _paint = paint;
  }

  public Window getLeftWindow() {
    return _leftWindow;
  }

  public void setLeftWindow(Window leftWindow) {
    _leftWindow = leftWindow;
  }

  public Window getRightWindow() {
    return _rightWindow;
  }

  public void setRightWindow(Window rightWindow) {
    _rightWindow = rightWindow;
  }

  // TODO: uncomment these lines:
  //  public Door getDoor() {
  //    return _door;
  //  }
  //
  //  public void setDoor(Door door) {
  //    _door = door;
  //  }

}