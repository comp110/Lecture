package comp110.lecture12;

public class WhileLoopExamples {

  // Example 1
  public void whileTrueIsForever() {
    int i = 0;
    while (true) {
      System.out.println("omg ilysm!!!!!!!! <3, CPU");
      i = i + 1;
      System.out.println(i);
    }
  }

  // Example 2
  public void e02anotherOne() {
    int i = 0;
    while (i < 3) {
      System.out.println("i:" + i);
      i = i + 1;
    }
    System.out.println("Done!");
  }

}
