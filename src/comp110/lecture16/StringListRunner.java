package comp110.lecture16;

public class StringListRunner {

  public static void main(String[] args) {

    StringList list = new StringList();
    list.add("One");
    list.add("Two");
    System.out.println(list.get(1));

    list.add("Three");
    System.out.println(list.get(2));

  }

}