package comp110.lecture14;

public class ArrayExamples {

  public static void main(String[] args) {
    ArrayExamples.basicUsage();

    // Shorthand initialization of an array
    double[] anArray = new double[] {};

    // Passing an array as an argument
    ArrayExamples.print(anArray);

    // Using a method that returns an array
    anArray = ArrayExamples.arrayReturnType();
    ArrayExamples.print(anArray);
  }

  public static void basicUsage() {
    // 1. Declare an array of double values

    // 2. Initialize an array of double values with 3 elements

    // 3. Assign values to each element

    // 4. Print each element

  }

  public static void print(double[] anArray) {
    // We'll write a generic algorithm for printing
    // each element of an array.
  }

  public static double[] arrayReturnType() {
    // Can a method return more than one value?
    // Using arrays, it can! Arrays allow us to bundle
    // many values together and treat them as a single
    // variable, return type, etc.
    return new double[] { 1.0, 2.0, 3.0, 4.0, 5.0 };
  }

}
