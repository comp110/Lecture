package comp110.lecture09;

public class InstancesExample {

  public static void main(String[] args) {
    System.exit(0); // TODO: Remove me after predicting the output

    TwitterPost post0 = new TwitterPost("#comp110 will crush the midterm");
    TwitterPost post1 = new TwitterPost("RIP brangelina :'(");

    post0.isLikedAFewTimes();
    post1.isLikedAFewTimes();
    post1.unliked();
    post0.unliked();
    post0.isLikedAFewTimes();

    System.out.println("post0: " + post0.getLikes());
    System.out.println("post1: " + post1.getLikes());

  }

}