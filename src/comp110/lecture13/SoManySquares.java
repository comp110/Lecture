package comp110.lecture13;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class SoManySquares {

  /* Instance Variables */
  private Group _art;
  private Color _dark, _light, _best;

  /* Constructor */
  public SoManySquares() {
    _art = new Group();

    /*
     * Color has a constructor with the following signature
     * 
     * Color(double red, double green, double blue, double opacity)
     */
    _dark = new Color(0.0, 0.0, 0.0, 1.0);
    _light = new Color(1.0, 1.0, 1.0, 1.0);
    _best = new Color(0.48, 0.67, 0.83, 1.0);
  }

  /* Methods */
  public void addSquares() {
    this.add(this.makeCell(0, 0, _best));
  }

  /* Getter / Setter Methods */
  public Group getArt() {
    return _art;
  }

  /* "Helper" utility methods */
  public void add(Shape shape) {
    _art.getChildren().add(shape);
  }

  public Rectangle makeCell(int column, int row, Color color) {

    // On the following line we're declaring multiple double variables at once.
    double height, width, margin;
    height = 10.0;
    width = 10.0;
    margin = 1.0;

    Rectangle cell = new Rectangle();
    cell.setWidth(width);
    cell.setHeight(height);
    cell.setX((width + margin) * column);
    cell.setY((height + margin) * row);
    cell.setFill(color);

    return cell;
  }

}
