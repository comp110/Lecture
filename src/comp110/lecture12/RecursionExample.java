package comp110.lecture12;

public class RecursionExample {

  /* "Looping" with recursion. */
  public void pushups(int n) {
    if (n > 0) {
      System.out.println("Pushup");
      this.pushups(n - 1);
    }
  }

  /* Looping with a while loop. */
  public void pushupsLoop(int n) {
    while (n > 0) {
      System.out.println("Pushup #" + n);
      n = n - 1;
    }
  }

}
