package comp110.lecture11.shapes;

public class Circle implements MeasurableShape {

  private double _radius;

  public Circle(double radius) {
    _radius = radius;
  }

  public double getArea() {
    return Math.PI * Math.pow(_radius, 2.0);
  }

  public double getPerimeter() {
    return 2.0 * Math.PI * _radius;
  }

}
