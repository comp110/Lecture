package comp110.lecture24;

public class CashGame {

  public static void main(String[] args) {

    Room startingRoom = Room.constructMap();

    double cashFound = CashGame.search(startingRoom);

    System.out.println("You win $" + cashFound + "!!!");

  }

  public static double search(Room room) {
    System.out.println("Enter " + room.getName() + ". Found $" + room.getCash());

    double cashFound = room.getCash();

    // TODO: Search Strategy

    System.out.println("Leave " + room.getName() + ".");
    return cashFound;
  }

}
