package comp110.lecture15;

public class DramaticPause {

  private static long ONE_SECOND = 1000L;

  public static void inSeconds(double n) {
    try {
      Thread.sleep((long) (n * ONE_SECOND));
    } catch (InterruptedException e) {
      System.out.println("InterruptedException encountered. Ignore this try/catch stuff, you'll get it in 401.");
    }
  }

}
