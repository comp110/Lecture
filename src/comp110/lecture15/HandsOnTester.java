package comp110.lecture15;

public class HandsOnTester {

  public static void main(String[] args) {

    HandsOnTester.testSwap();
    // HandsOnTester.debugShuffle();

  }

  public static void testSwap() {
    Carton carton = new Carton(2);

    Egg rawEgg, hardBoiledEgg;

    // Initialize 2 eggs.

    // Raw egg starts at index 0.
    rawEgg = new Egg();
    carton.setEgg(0, rawEgg);

    // Hard-boiled egg starts at index 1.
    hardBoiledEgg = new Egg();
    hardBoiledEgg.hardBoil();
    carton.setEgg(1, hardBoiledEgg);

    // Swap the two eggs.
    carton.swapEggs(0, 1);

    // Success means index 0 now has the hardBoiledEgg
    // and index 1 has the rawEgg.
    boolean test0 = carton.removeEgg(0) == hardBoiledEgg;
    boolean test1 = carton.removeEgg(1) == rawEgg;
    boolean success = test0 && test1;
    System.out.println("swap method test - success: " + success);
  }

  public static void debugShuffle() {

    System.out.println("Debugging GameModel's shuffling.");
    GameModel game = new GameModel(2);
    Carton carton = game.getCarton();
    int i = 0;
    while (i < carton.getLength()) {
      System.out.println(carton.removeEgg(i));
      i++;
    }

  }

}
