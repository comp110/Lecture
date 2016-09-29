package comp110.lecture11.audio;

public class AudioInterfaceRunner {

  public static void main(String[] args) {

    Phone myPhone = new Phone();

    Headphones beats = new Headphones();
    myPhone.setHeadphones(beats);
    myPhone.play("Twenty One Pilots");

    Speakers bose = new Speakers();
    bose.turnOn();
    myPhone.setSpeakers(bose);
    myPhone.play("Bob Marley");

  }

}
