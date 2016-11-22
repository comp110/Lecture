package comp110.lecture24;

public class CallStackError {

  public static void main(String[] args) {
    CallStackError example = new CallStackError();
    example.stack(0);
  }

  // What happens here?
  public void stack(int n) {
    System.out.println("Stacking... " + n);
    this.stack(n + 1);
  }

}