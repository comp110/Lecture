package comp110.lecture11.audio;

public class Phone {

  private Headphones _headphones;
  private Speakers _speakers;

  public Phone() {
    System.out.println("A new Phone instance was constructed");
  }

  public void play(String audio) {
    System.out.println("Play " + audio + " - command received.");

    if (_headphones != null) {
      _headphones.emitAudio(audio);
    }

    if (_speakers != null) {
      _speakers.emitAudio(audio);
    }

  }

  public void setHeadphones(Headphones headphones) {
    _headphones = headphones;
  }

  public void setSpeakers(Speakers speakers) {
    _speakers = speakers;
  }

}