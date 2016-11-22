package comp110.lecture24;

public class RecursionDemos {

  public static void main(String[] args) {
    RecursionDemos.countdown(4);
  }

  public static void countdown(int n) {
    System.out.println("n: " + n);
    if (n > 0) {
      RecursionDemos.countdown(n - 1);
    }
  }

  // TODO: Factorial

}
