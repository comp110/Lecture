package comp110.lecture11.shapes;

public class ShapeInterfaceRunner {

  public static void main(String[] args) {

    MeasurableShape aShape = null;
    System.out.println("The area of the shape is: " + aShape.getArea());
    System.out.println("The perimeter of the shape is: " + aShape.getPerimeter());

  }

}
