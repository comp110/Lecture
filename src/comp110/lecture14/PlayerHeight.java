package comp110.lecture14;

public class PlayerHeight {

  public static void main(String[] args) {
    double[] heights = new double[] { 6.0, 7.0 };
    double average = PlayerHeight.average(heights);
    System.out.println("The average player height is " + average);
  }

  public static double average(double[] input) {
    double sum = 0.0;

    // TODO: Calculate sum

    return sum / 2;
  }

  public static double[] heights() {
    return new double[] { 6.08, 6.5, 6.0, 6.83, 6.75, 6.83, 6.5, 6.33, 6.42, 6.16, 6.33, 6.5, 6.08, 6.666, 6.666 };
  }

}
