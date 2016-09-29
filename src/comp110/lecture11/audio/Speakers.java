package comp110.lecture11.audio;

public class Speakers implements AudioOutputDevice {

  private boolean _powered;
  private double _volume;

  public Speakers() {
    _powered = false;
    _volume = 11.0;
  }

  public void emitAudio(String audio) {
    if (_powered) {
      System.out.println(audio + " is blasting from speakers at volume " + _volume + "!");
    } else {
      System.out.println("The speakers are turned off.");
    }
  }

  public void turnOn() {
    _powered = true;
  }

  public void turnOff() {
    _powered = false;
  }

}
