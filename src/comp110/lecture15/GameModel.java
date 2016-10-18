package comp110.lecture15;

import java.util.Random;

public class GameModel {

  /* Instance Variables */
  private int _turn;
  private int[] _playerTallies;
  private Carton _carton;

  /* Constructor */
  public GameModel(int playerCount) {
    _turn = 0;
    _carton = this.initCarton(playerCount * 6);
    _playerTallies = this.initPlayerTallies(playerCount);
  }

  /* Initialization Methods */
  public Carton initCarton(int eggCount) {
    Carton carton = new Carton(eggCount);
    this.hardboilEggs(carton, eggCount / 3 * 2);
    this.shuffleEggs(carton, eggCount);
    return carton;
  }

  public void hardboilEggs(Carton carton, int howMany) {
    System.out.println("... hard-boiling " + howMany + " eggs ...");
    int i = 0;
    while (i < howMany) {
      Egg egg = carton.removeEgg(i);
      egg.hardBoil();
      carton.setEgg(i, egg);
      i++;
    }
  }

  public void shuffleEggs(Carton carton, int eggCount) {
    System.out.println("... shuffling " + eggCount + " eggs ...");
    Random random = new Random();

    // Pseudo-code:
    // 
    // Let's swap every egg with one other egg moving from the back
    // of the carton to the front of the carton.
    //
    // 1. Start counting from the end of the carton
    //   1.1 Assign eggCount - 1 to a counter variable named i
    // 2. Loop backwards through the carton
    //   2.1 The test condition is i >= 0 because that's false
    //       when i becomes -1
    //   2.2 Generate a random number and assign it to randomIndex
    //   2.3 Swap the eggs in the carton at indices i and randomIndex
    //   2.4 Subtract 1 from i

  }

  public int[] initPlayerTallies(int playerCount) {
    int[] players = new int[playerCount];
    int i = 0;
    while (i < players.length) {
      // Every player begins with 0 raw eggs
      players[i] = 0;
      i++;
    }
    return players;
  }

  /* Gameplay Methods */
  public void nextTurn() {
    _turn++;
  }

  public void incrementPlayersTally() {
    // Add one to the current player's tally
    _playerTallies[_turn % _playerTallies.length] += 1;
  }

  public Carton getCarton() {
    return _carton;
  }

  public int getPlayer() {
    return (_turn % _playerTallies.length);
  }

  /*
   * The getLoser method should return -1 if no one has lost the game yet.
   * Otherwise, it should return the player # who lost.
   * 
   * Inverse: Return the player # who lost. When no one has lost, return -1.
   */
  public int getLoser() {
    // TODO: Write some pseudo-code
    return -1;
  }

  public boolean isOver() {
    return this.getLoser() >= 0;
  }

  /*
   * toString is a special method that Java will call in circumstances where it
   * wants to convert an instance of the GameModel class to a String. i.e.
   * System.out.println() or in String concatenation.
   */
  public String toString() {
    String results = "\n";
    int i = 0;
    while (i < _playerTallies.length) {
      results += "Player " + i + "'s cracked " + _playerTallies[i] + " raw egg(s)\n";
      i++;
    }
    results += "\n";
    return results;
  }

}
