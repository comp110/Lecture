package comp110.lecture15;

public class Carton {

  /* Instance Variables */
  private Egg[] _eggs;

  /* Constructor */
  public Carton(int eggs) {

    _eggs = new Egg[eggs];

    int i = 0;
    while (i < _eggs.length) {
      _eggs[i] = new Egg();
      i++;
    }

  }

  /* Methods */
  public Egg removeEgg(int index) {
    Egg selected = _eggs[index];
    _eggs[index] = null; // Why assign null?
    return selected;
  }

  public void setEgg(int index, Egg egg) {
    _eggs[index] = egg;
  }

  public void swapEggs(int a, int b) {
    // TODO
  }

  public int getLength() {
    return _eggs.length;
  }

  public String toString() {
    String output = "";

    String eggs = "";
    String indices = "";

    int i = 0;
    while (i < _eggs.length) {

      if (_eggs[i] == null) {
        eggs += "   ";
      } else {
        eggs += " @ ";
      }

      if (i < 10) {
        indices += " " + i + " ";
      } else {
        indices += i + " ";
      }

      i++;

      if (i % 6 == 0) {
        output += eggs + "\n" + indices + "\n";
        eggs = "";
        indices = "";
      }
    }

    return output;
  }

}
