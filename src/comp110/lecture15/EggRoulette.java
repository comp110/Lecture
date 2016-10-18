package comp110.lecture15;

import comp110.lecture08.Console;

public class EggRoulette {

  public static void main(String[] args) {

    GameModel game = EggRoulette.initGame();
    Carton carton = game.getCarton();

    while (game.isOver() == false) {

      int index = EggRoulette.getPlayersIndexChoice(game);
      Egg egg = carton.removeEgg(index);

      DramaticPause.inSeconds(0.2);

      System.out.println(egg);
      egg.crackOnHead();
      if (egg.isRaw()) {
        game.incrementPlayersTally();
      }

      DramaticPause.inSeconds(0.8);

      System.out.println(game); // Print Scores
      game.nextTurn();

    }

    EggRoulette.displayGameOver(game);

  }

  private static GameModel initGame() {
    Console userInput = new Console();
    System.out.println("Welcome to Egg Roulette");
    System.out.println("How many players?");
    int players = userInput.askForAnInt();
    GameModel game = new GameModel(players);
    return game;
  }

  private static int getPlayersIndexChoice(GameModel state) {
    System.out.println(state.getCarton());
    System.out.println("Player " + (state.getPlayer()) + " pick an egg...");
    Console userInput = new Console();
    int index = userInput.askForAnInt();
    return index;
  }

  private static void displayGameOver(GameModel state) {
    System.out.println("Game over. Player " + state.getLoser() + " loses :(");
  }

}
