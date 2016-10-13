package comp110.lecture14;

public class StaticExamples {

  public static void main(String[] args) {
    System.out.println(Math.round(1.5));
    StaticExamples.demo("test");
  }

  public static void demo(String aString) {
    System.out.println("This is a static method");
    System.out.println("It works like an instance method except:");
    System.out.println(" - You call static methods on their class not an instance");
    System.out.println(" - Static methods can't access to instance variables");
    System.out.println("Static methods can have parameters like " + aString);
    System.out.println("Static methods can also return values, just like instance methods");
    System.out.println("They're useful for writing little utility methods.");
  }

}
