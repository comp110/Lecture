package comp110.lecture04;

public class Calculator {

  public int add(int x, int y) {
    System.out.println("add was called with (" + x + ", " + y + ")");
    return x + y;
  }

  public int subtract(int x, int y) {
    System.out.println("subtract was called with (" + x + ", " + y + ")");
    return x - y;
  }

  public int multiply(int x, int y) {
    System.out.println("multiply was called with (" + x + ", " + y + ")");
    return x * y;
  }

  public int divide(int x, int y) {
    System.out.println("divide was called with (" + x + ", " + y + ")");
    return x / y;
  }

  public int modulo(int x, int y) {
    System.out.println("modulo was called with (" + x + ", " + y + ")");
    return x % y;
  }

}