package comp110.lecture13;

import comp110.AutoGUI;
import javafx.scene.Group;

public class GraphicsRunner {

  public static void main(String[] args) {

    SoManySquares los = new SoManySquares();
    los.addSquares();
    Group art = los.getArt();
    new AutoGUI(art);

  }

}
