package comp110.lecture16;

import java.util.Arrays;
import java.util.Random;

public class StringList {

  // An array to hold our values
  private String[] _values;

  // Keep track of how many values that have been added
  private int _count;

  public StringList() {
    _values = new String[2];
    _count = 0;
  }

  // TODO:
  // Goal: If our values array runs out of space
  // 1. create a new array that can hold *double* the previous
  //    number of values.
  // 2. copy our current values over to the new array.
  // 3. replace the old values array with the new values array
  public void add(String aString) {

    // Implement your _values resize logic here.

    _values[_count] = aString;
    _count++;

  }

  public String get(int index) {
    return _values[index];
  }

  public String getRandom() {
    Random random = new Random();
    return _values[random.nextInt(_count)];
  }

  public void set(int index, String aString) {
    _values[index] = aString;
  }

  public int size() {
    return _count;
  }

  /**
   * Hacker Edition Challenge: Remove the given index from _strings. Shift
   * following indices to the left.
   */
  public void remove(int index) {

  }

  /**
   * Hacker Edition Challenge: Remove first instance of aString from _strings.
   */
  public void remove(String aString) {

  }

}
