package comp110.lecture17;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

  public static void main(String[] args) {

    // Java's List Interface (ADT) works just like our
    // Hand-made StringList class from last lecture,
    // but with even more capabilities built-in.

    List<String> list = new ArrayList<String>();
    list.add("A");
    list.add("A");
    list.add("B");
    list.add("C");

  }

}